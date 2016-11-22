package com.tianma.mesos.domain.mesos.v1;


import com.tianma.mesos.support.util.MesosModelUtils;

import java.util.List;

/**
 * Created by jie on 16-11-21.
 */
public class StateSummary {

    private String cluster;

    private String hostname;

    private List<SlaveSummary> slaves;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<SlaveSummary> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<SlaveSummary> slaves) {
        this.slaves = slaves;
    }

    @Override
    public String toString() {
        return MesosModelUtils.toString(this);
    }
}
