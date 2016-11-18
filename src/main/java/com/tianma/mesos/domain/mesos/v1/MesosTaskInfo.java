package com.tianma.mesos.domain.mesos.v1;

import com.egoo.linkcloud.mesos.support.common.TaskStatus;
import com.egoo.linkcloud.mesos.support.common.TaskType;

import java.util.List;

/**
 * Created by murong on 2016/5/6.
 */
public class MesosTaskInfo {

    private String taskId;
    private String taskName;
    private String tenantId;
    private TaskStatus state;
    private TaskType taskType;
    private String host;
    private String startTime;
    private String endTime;
    private List<Integer> ports;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public TaskStatus getState() {
        return state;
    }

    public void setState(TaskStatus state) {
        this.state = state;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "MesosTaskInfo{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", state=" + state +
                ", taskType=" + taskType +
                ", host='" + host + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", ports=" + ports +
                '}';
    }
}
