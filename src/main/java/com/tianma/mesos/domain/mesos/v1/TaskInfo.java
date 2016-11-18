package com.tianma.mesos.domain.mesos.v1;

import com.egoo.linkcloud.mesos.support.common.TaskStatus;

import java.security.Timestamp;

/**
 * Created by fiboliu on 16-4-25.
 */
public class TaskInfo {

    private String taskId;

    private String taskName;

    private TaskStatus status;

    private Timestamp startTime;

    private Timestamp stoppedTime;

    private String exectorHost;

    /**
     * Constructor
     */
    public TaskInfo() {

    }

    public TaskInfo(String taskId, String taskName, Timestamp stoppedTime, String exectorHost, TaskStatus status, Timestamp startTime) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.stoppedTime = stoppedTime;
        this.exectorHost = exectorHost;
        this.status = status;
        this.startTime = startTime;
    }

    /**
     * Getter And Setter
     */
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

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStoppedTime() {
        return stoppedTime;
    }

    public void setStoppedTime(Timestamp stoppedTime) {
        this.stoppedTime = stoppedTime;
    }

    public String getExectorHost() {
        return exectorHost;
    }

    public void setExectorHost(String exectorHost) {
        this.exectorHost = exectorHost;
    }

    @Override
    public String toString() {
        return "TaskInfo{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", status=" + status +
                ", startTime=" + startTime +
                ", stoppedTime=" + stoppedTime +
                ", exectorHost='" + exectorHost + '\'' +
                '}';
    }
}
