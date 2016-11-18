package com.tianma.mesos.domain.cluster;

import com.egoo.linkcloud.mesos.domain.cluster.vmhost.VMInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;

/**
 * Created by fiboliu on 16-4-25.
 */
@Component
public class AliyunMesosCluster {

    private static final Logger log = LoggerFactory.getLogger(AliyunMesosCluster.class);

    /**
     * 联络云集群基本情况
     */
    private static final String contactClusterMaster = "aliyun.vm.com.tianma.mesos.contact.master%d.%s.ip";
    private static final String contactClusterSlave = "aliyun.vm.com.tianma.mesos.contact.slave%d.%s.ip";
    private static final String contactClusterMasterNumberProfile = "aliyun.vm.com.tianma.mesos.contactClusterMasterNumber";
    private static final String contactClusterSlaveNumberProfile = "aliyun.vm.com.tianma.mesos.contactClusterSlaveNumber";

    private Map<String, Map<String, List<VMInfo>>> clusterVmInfoList = new HashMap<String, Map<String, List<VMInfo>>>();

    public AliyunMesosCluster() {

        Properties properties = new Properties();
        try {
            properties.load(AliyunMesosCluster.class.getClassLoader().getResourceAsStream("vms/vmhost.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int contactClusterMasterNumber = Integer.valueOf(properties.getProperty(contactClusterMasterNumberProfile));
        int contactClusterSlaveNumber = Integer.valueOf(properties.getProperty(contactClusterSlaveNumberProfile));

        //init contact cluster
        Map<String, List<VMInfo>> contactClusterVmInfo = new HashMap<String, List<VMInfo>>();
        //1. master node
        /***************** master node begin *************************/
        List<VMInfo> contactClusterMasterList = new ArrayList<VMInfo>();
        for(int i = 1; i < contactClusterMasterNumber+1; i++) {
            VMInfo contactMasterVmInfo = new VMInfo();
            String masterPublicProfile = String.format(contactClusterMaster, i, "public");
            System.out.println(masterPublicProfile);
            contactMasterVmInfo.setPublicHost(properties.getProperty(masterPublicProfile));
            String masterPrivateProfile = String.format(contactClusterMaster, i, "private");
            System.out.println(masterPrivateProfile);
            contactMasterVmInfo.setPrivateHost(properties.getProperty(masterPrivateProfile));
            contactClusterMasterList.add(contactMasterVmInfo);
        }
        contactClusterVmInfo.put("master", contactClusterMasterList);
        /***************** master node end *************************/
        //2.slave node
        /*************** slave node begin **************************/
        List<VMInfo> contactClusterSlaveList = new ArrayList<VMInfo>();
        for(int i = 1; i < contactClusterSlaveNumber+1; i++) {
            VMInfo contactMasterVmInfo = new VMInfo();
            String slavePublicProfile = String.format(contactClusterSlave, i, "public");
            contactMasterVmInfo.setPublicHost(properties.getProperty(slavePublicProfile));
            String slavePrivateProfile = String.format(contactClusterSlave, i, "private");
            contactMasterVmInfo.setPrivateHost(properties.getProperty(slavePrivateProfile));
            contactClusterSlaveList.add(contactMasterVmInfo);
        }
        contactClusterVmInfo.put("slaves", contactClusterSlaveList);
        /************** slave node end ******************************/

        clusterVmInfoList.put("contact", contactClusterVmInfo);

        ///other cluster

    }
    /**
     * 从私有IP转为公有IP, 使用时不能对master节点信息进行转换
     * @param privateIp
     * @return
     */
    public String getPublicIp(String cluster, String privateIp) {

        List<VMInfo> currentClusterVM = clusterVmInfoList.get(cluster).get("slaves");
        for(VMInfo vmInfo : currentClusterVM) {
            if(vmInfo.getPrivateHost().equals(privateIp)) {
                return vmInfo.getPublicHost();
            }
        }
        return null;
    }

    /**
     * 从公有IP转为私有IP, 使用时不能对master节点信息进行转换
     * @param cluster
     * @param publicIp
     * @return
     */
    public String getPrivateIp(String cluster, String publicIp) {

        List<VMInfo> currentClusterVM = clusterVmInfoList.get(cluster).get("slaves");
        for(VMInfo vmInfo : currentClusterVM) {
            if(vmInfo.getPublicHost().equals(publicIp)) {
                return vmInfo.getPublicHost();
            }
        }
        return null;
    }
}
