package com.tianma.mesos.client.mesos;

import com.tianma.mesos.domain.mesos.v1.GetSlavesResponse;
import com.tianma.mesos.domain.mesos.v1.MesosVersion;
import com.tianma.mesos.domain.mesos.v1.StateSummary;
import com.tianma.mesos.domain.mesos.v1.SystemStats;
import com.tianma.mesos.support.exception.ResponseException;
import feign.RequestLine;

/**
 * Created by jie on 16-11-18.
 */
public interface MesosMonitor {
    // Monitor
    @RequestLine("GET /version")
    MesosVersion getVersion() throws ResponseException;

    @RequestLine("GET /system/stats.json")
    SystemStats getMasterSystemStats() throws ResponseException;

    @RequestLine("GET /master/slaves")
    GetSlavesResponse getMasterSlaves() throws ResponseException;

    @RequestLine("GET /state-summary")
    StateSummary getStateSummary() throws ResponseException;
}
