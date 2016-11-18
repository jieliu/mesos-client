package com.tianma.mesos.domain.cluster;

import com.egoo.linkcloud.mesos.domain.cluster.vmhost.VMInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by fiboliu on 16-4-25.
 */
public class ClusterInfo {

    //集群名称
    private String clusterName;

    //主节点ip地址
    private String serverHost;

    //主节点端口
    private String serverPort;

    //启动时间
    private Date startDate;

    //选主时间
    private Date electedDate;

    //slave节点信息
    private List<VMInfo> slaves;
    /**
     * Constructor
     */
    public ClusterInfo() {

    }

    public ClusterInfo(String clusterName, Date electedDate, Date startDate, String serverPort, String serverHost) {
        this.clusterName = clusterName;
        this.electedDate = electedDate;
        this.startDate = startDate;
        this.serverPort = serverPort;
        this.serverHost = serverHost;
    }

    /**
     * Getter and Setter
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(Date electedDate) {
        this.electedDate = electedDate;
    }

    @Override
    public String toString() {
        return "ClusterInfo{" +
                "clusterName='" + clusterName + '\'' +
                ", serverHost='" + serverHost + '\'' +
                ", serverPort='" + serverPort + '\'' +
                ", startDate=" + startDate +
                ", electedDate=" + electedDate +
                '}';
    }
}
