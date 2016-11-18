package com.tianma.mesos.domain.mesos.v1;

import java.util.List;

/**
 * Created by murong on 2016/5/9.
 */
public class MesosClusterInfo {

    private String clusterName;
    private List<String> master;
    private List<String> slave;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public List<String> getMaster() {
        return master;
    }

    public void setMaster(List<String> master) {
        this.master = master;
    }

    public List<String> getSlave() {
        return slave;
    }

    public void setSlave(List<String> slave) {
        this.slave = slave;
    }

    @Override
    public String toString() {
        return "MesosClusterInfo{" +
                "clusterName='" + clusterName + '\'' +
                ", master=" + master +
                ", slave=" + slave +
                '}';
    }
}
