package com.tianma.mesos.domain.cluster.master;

import java.security.Timestamp;

/**
 * Created by fiboliu on 16-4-25.
 */
public class MasterInfo {
    //主节点ip地址
    private String serverHost;

    //主节点端口
    private String serverPort;

    //启动时间
    private Timestamp startDate;

    //选主时间
    private Timestamp electedDate;

    //主机名称
    private String hostName;

    /**
     * Constructor
     */
    public MasterInfo() {

    }
}
