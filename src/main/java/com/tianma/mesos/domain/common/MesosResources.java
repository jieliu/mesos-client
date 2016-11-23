package com.tianma.mesos.domain.common;

import com.tianma.mesos.support.util.ModelUtils;

/**
 * Created by jie on 16-11-23.
 */
public class MesosResources {
    private double cpus;

    private double disk;

    private double mem;

    private String ports;

    public double getCpus() {
        return cpus;
    }

    public void setCpus(double cpus) {
        this.cpus = cpus;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
