package com.tianma.mesos.domain.mesos.v1;

import java.util.List;

/**
 * Created by murong on 2016/5/8.
 */
public class MesosClsuterStateInfo {

    private String cluster;
    private String host;
    private String port;
    private String version;
    private String buildTime;
    private String buildUser;
    private String startTime;
    private String electedTime;
    private int activatedSlaves;
    private int deactivatedSlaves;
    private int taskError;
    private int taskFailed;
    private int taskFinished;
    private int taskKilled;
    private int taskLost;
    private int taskRunning;
    private int taskStaging;
    private int taskStarting;
    private double totalCpu;
    private double usedCpu;
    private double totalMem;
    private double usedMem;
    private double totalDisk;
    private double usedDisk;
    private List<String> slaves;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getBuildUser() {
        return buildUser;
    }

    public void setBuildUser(String buildUser) {
        this.buildUser = buildUser;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getElectedTime() {
        return electedTime;
    }

    public void setElectedTime(String electedTime) {
        this.electedTime = electedTime;
    }

    public int getActivatedSlaves() {
        return activatedSlaves;
    }

    public void setActivatedSlaves(int activatedSlaves) {
        this.activatedSlaves = activatedSlaves;
    }

    public int getDeactivatedSlaves() {
        return deactivatedSlaves;
    }

    public void setDeactivatedSlaves(int deactivatedSlaves) {
        this.deactivatedSlaves = deactivatedSlaves;
    }

    public int getTaskError() {
        return taskError;
    }

    public void setTaskError(int taskError) {
        this.taskError = taskError;
    }

    public int getTaskFailed() {
        return taskFailed;
    }

    public void setTaskFailed(int taskFailed) {
        this.taskFailed = taskFailed;
    }

    public int getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(int taskFinished) {
        this.taskFinished = taskFinished;
    }

    public int getTaskKilled() {
        return taskKilled;
    }

    public void setTaskKilled(int taskKilled) {
        this.taskKilled = taskKilled;
    }

    public int getTaskLost() {
        return taskLost;
    }

    public void setTaskLost(int taskLost) {
        this.taskLost = taskLost;
    }

    public int getTaskRunning() {
        return taskRunning;
    }

    public void setTaskRunning(int taskRunning) {
        this.taskRunning = taskRunning;
    }

    public int getTaskStaging() {
        return taskStaging;
    }

    public void setTaskStaging(int taskStaging) {
        this.taskStaging = taskStaging;
    }

    public int getTaskStarting() {
        return taskStarting;
    }

    public void setTaskStarting(int taskStarting) {
        this.taskStarting = taskStarting;
    }

    public double getTotalCpu() {
        return totalCpu;
    }

    public void setTotalCpu(double totalCpu) {
        this.totalCpu = totalCpu;
    }

    public double getUsedCpu() {
        return usedCpu;
    }

    public void setUsedCpu(double usedCpu) {
        this.usedCpu = usedCpu;
    }

    public double getTotalMem() {
        return totalMem;
    }

    public void setTotalMem(double totalMem) {
        this.totalMem = totalMem;
    }

    public double getUsedMem() {
        return usedMem;
    }

    public void setUsedMem(double usedMem) {
        this.usedMem = usedMem;
    }

    public double getTotalDisk() {
        return totalDisk;
    }

    public void setTotalDisk(double totalDisk) {
        this.totalDisk = totalDisk;
    }

    public double getUsedDisk() {
        return usedDisk;
    }

    public void setUsedDisk(double usedDisk) {
        this.usedDisk = usedDisk;
    }

    public List<String> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<String> slaves) {
        this.slaves = slaves;
    }

    @Override
    public String toString() {
        return "MesosClsuterStateInfo{" +
                "cluster='" + cluster + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", version='" + version + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", buildUser='" + buildUser + '\'' +
                ", startTime='" + startTime + '\'' +
                ", electedTime='" + electedTime + '\'' +
                ", activatedSlaves=" + activatedSlaves +
                ", deactivatedSlaves=" + deactivatedSlaves +
                ", taskError=" + taskError +
                ", taskFailed=" + taskFailed +
                ", taskFinished=" + taskFinished +
                ", taskKilled=" + taskKilled +
                ", taskLost=" + taskLost +
                ", taskRunning=" + taskRunning +
                ", taskStaging=" + taskStaging +
                ", taskStarting=" + taskStarting +
                ", totalCpu=" + totalCpu +
                ", usedCpu=" + usedCpu +
                ", totalMem=" + totalMem +
                ", usedMem=" + usedMem +
                ", totalDisk=" + totalDisk +
                ", usedDisk=" + usedDisk +
                ", slaves=" + slaves +
                '}';
    }
}