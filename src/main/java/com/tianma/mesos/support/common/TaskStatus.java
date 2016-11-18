package com.tianma.mesos.support.common;

/**
 * Created by fiboliu on 16-4-25.
 */
public enum TaskStatus {

    /**
     * Mesos调度中的task状态信息
     */
    Staged, Stared, Finished, Killed, Failed, Lost;

}
