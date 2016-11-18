package com.tianma.mesos.domain.cluster.vmhost;

/**
 * Created by fiboliu on 16-4-25.
 */
public class VMInfo {

    //外网地址
    private String publicHost;

    //内网地址
    private String privateHost;

    //当前节点中可用的端口号信息
    private int avalibalePorts;

    /**
     * Conctructor
     * @return
     */
    public VMInfo() {

    }

    public VMInfo(String publicHost, int publicPort, int privatePort, String privateHost) {
        this.publicHost = publicHost;
        this.privateHost = privateHost;
    }

    /**
     * Getter and Setter
     * @return
     */
    public String getPublicHost() {
        return publicHost;
    }

    public void setPublicHost(String publicHost) {
        this.publicHost = publicHost;
    }

    public String getPrivateHost() {
        return privateHost;
    }

    public void setPrivateHost(String privateHost) {
        this.privateHost = privateHost;
    }

    @Override
    public String toString() {
        return "VMInfo{" +
                "publicHost='" + publicHost + '\'' +
                ", privateHost='" + privateHost + '\'' +
                '}';
    }
}
