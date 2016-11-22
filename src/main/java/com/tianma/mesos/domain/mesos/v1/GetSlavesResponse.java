package com.tianma.mesos.domain.mesos.v1;

import com.tianma.mesos.support.util.MesosModelUtils;

import java.util.List;

/**
 * Created by jie on 16-11-21.
 */
public class GetSlavesResponse {
    private List<Slave> slaves;

    public List<Slave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<Slave> slaves) {
        this.slaves = slaves;
    }

    @Override
    public String toString() {
        return MesosModelUtils.toString(this);
    }
}
