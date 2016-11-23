package com.tianma.mesos.domain.mesos.v1;

import com.google.gson.annotations.SerializedName;
import com.tianma.mesos.support.util.ModelUtils;

/**
 * Created by jie on 16-11-18.
 */
public class Slave {

    public static class OfferedResources {
        private double cpus;

        private double disk;

        private double mem;

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

        @Override
        public String toString() {
            return ModelUtils.toString(this);
        }
    }

    public static class Resources {
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

    public static class Attributes {


    }

    private boolean active;

    private Attributes attributes;

    private String hostname;

    private String id;

    @SerializedName("offered_resources")
    private OfferedResources offeredResources;

    private String pid;

    @SerializedName("registered_time")
    private double registeredTime;

    @SerializedName("reregistered_time")
    private double reregisteredTime;

    @SerializedName("reserved_resources")
    private Resources reservedResource;

    @SerializedName("resources")
    private Resources resources;

    @SerializedName("unreserved_resources")
    private Resources unreservedResources;

    @SerializedName("used_resources")
    private OfferedResources usedResources;

    private String version;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OfferedResources getOfferedResources() {
        return offeredResources;
    }

    public void setOfferedResources(OfferedResources offeredResources) {
        this.offeredResources = offeredResources;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public double getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(double registeredTime) {
        this.registeredTime = registeredTime;
    }

    public double getReregisteredTime() {
        return reregisteredTime;
    }

    public void setReregisteredTime(double reregisteredTime) {
        this.reregisteredTime = reregisteredTime;
    }

    public Resources getReservedResource() {
        return reservedResource;
    }

    public void setReservedResource(Resources reservedResource) {
        this.reservedResource = reservedResource;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResource(Resources resource) {
        this.resources = resource;
    }

    public Resources getUnreservedResource() {
        return unreservedResources;
    }

    public void setUnreservedResource(Resources unreservedResource) {
        this.unreservedResources = unreservedResource;
    }

    public OfferedResources getUsedResources() {
        return usedResources;
    }

    public void setUsedResources(OfferedResources usedResources) {
        this.usedResources = usedResources;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
