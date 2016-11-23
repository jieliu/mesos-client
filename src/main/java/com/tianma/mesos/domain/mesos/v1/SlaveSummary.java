package com.tianma.mesos.domain.mesos.v1;

import com.google.gson.annotations.SerializedName;
import com.tianma.mesos.support.util.ModelUtils;

/**
 * Created by jie on 16-11-21.
 */
public class SlaveSummary {

    @SerializedName("TASK_ERROR")
    private String taskError;

    @SerializedName("TASK_FINISHED")
    private String taskFinished;

    @SerializedName("TASK_KILLED")
    private String taskKilled;

    @SerializedName("TASK_LOST")
    private String taskLost;

    @SerializedName("TASK_RUNNING")
    private String taskRunning;

    @SerializedName("TASK_STAGING")
    private String taskStaging;

    @SerializedName("TASK_STARTING")
    private String taskStarting;

    private boolean active;

    private Slave.Attributes attributes;

    private String hostname;

    private String id;

    @SerializedName("offered_resources")
    private Slave.OfferedResources offeredResources;

    private String pid;

    @SerializedName("registered_time")
    private double registeredTime;

    @SerializedName("reregistered_time")
    private double reregisteredTime;

    @SerializedName("reserved_resources")
    private Slave.Resources reservedResource;

    @SerializedName("resources")
    private Slave.Resources resources;

    @SerializedName("unreserved_resources")
    private Slave.Resources unreservedResources;

    @SerializedName("used_resources")
    private Slave.OfferedResources usedResources;

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

    public Slave.OfferedResources getOfferedResources() {
        return offeredResources;
    }

    public void setOfferedResources(Slave.OfferedResources offeredResources) {
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

    public Slave.Resources getReservedResource() {
        return reservedResource;
    }

    public void setReservedResource(Slave.Resources reservedResource) {
        this.reservedResource = reservedResource;
    }

    public Slave.Resources getResources() {
        return resources;
    }

    public void setResource(Slave.Resources resource) {
        this.resources = resource;
    }

    public Slave.Resources getUnreservedResource() {
        return unreservedResources;
    }

    public void setUnreservedResource(Slave.Resources unreservedResource) {
        this.unreservedResources = unreservedResource;
    }

    public Slave.OfferedResources getUsedResources() {
        return usedResources;
    }

    public void setUsedResources(Slave.OfferedResources usedResources) {
        this.usedResources = usedResources;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTaskError() {
        return taskError;
    }

    public void setTaskError(String taskError) {
        this.taskError = taskError;
    }

    public String getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(String taskFinished) {
        this.taskFinished = taskFinished;
    }

    public String getTaskKilled() {
        return taskKilled;
    }

    public void setTaskKilled(String taskKilled) {
        this.taskKilled = taskKilled;
    }

    public String getTaskLost() {
        return taskLost;
    }

    public void setTaskLost(String taskLost) {
        this.taskLost = taskLost;
    }

    public String getTaskRunning() {
        return taskRunning;
    }

    public void setTaskRunning(String taskRunning) {
        this.taskRunning = taskRunning;
    }

    public String getTaskStaging() {
        return taskStaging;
    }

    public void setTaskStaging(String taskStaging) {
        this.taskStaging = taskStaging;
    }

    public String getTaskStarting() {
        return taskStarting;
    }

    public void setTaskStarting(String taskStarting) {
        this.taskStarting = taskStarting;
    }

    public Slave.Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Slave.Attributes attributes) {
        this.attributes = attributes;
    }

    public void setResources(Slave.Resources resources) {
        this.resources = resources;
    }

    public Slave.Resources getUnreservedResources() {
        return unreservedResources;
    }

    public void setUnreservedResources(Slave.Resources unreservedResources) {
        this.unreservedResources = unreservedResources;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
