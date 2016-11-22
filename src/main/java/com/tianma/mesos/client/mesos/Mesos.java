package com.tianma.mesos.client.mesos;

import com.tianma.mesos.domain.marathon.v2.GetAppsResponse;
import com.tianma.mesos.support.exception.ResponseException;
import feign.RequestLine;

/**
 * Created by jie on 16-11-17.
 */
public interface Mesos {

    //Scheduler
    @RequestLine("GET /api/v1/scheduler")
    GetAppsResponse getApps() throws ResponseException;
}
