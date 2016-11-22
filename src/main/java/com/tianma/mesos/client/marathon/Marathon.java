package com.tianma.mesos.client.marathon;

import com.tianma.mesos.domain.marathon.v2.*;
import com.tianma.mesos.support.exception.ResponseException;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface Marathon {
    // Apps
	@RequestLine("GET /v2/apps")
	GetAppsResponse getApps() throws ResponseException;

	@RequestLine("GET /v2/apps/{id}")
	GetAppResponse getApp(@Param("id") String id) throws ResponseException;

	@RequestLine("GET /v2/apps/{id}/tasks")
	GetAppTasksResponse getAppTasks(@Param("id") String id) throws ResponseException;

	@RequestLine("GET /v2/tasks")
	GetTasksResponse getTasks() throws ResponseException;

	@RequestLine("POST /v2/apps")
	App createApp(App app) throws ResponseException;

	@RequestLine("PUT /v2/apps/{app_id}?force={force}")
	Result updateApp(@Param("app_id") String appId, App app,
                     @Param("force") boolean force) throws ResponseException;

	@RequestLine("POST /v2/apps/{id}/restart?force={force}")
	void restartApp(@Param("id") String id, @Param("force") boolean force) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{id}")
	Result deleteApp(@Param("id") String id) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{app_id}/tasks?host={host}&scale={scale}")
	DeleteAppTasksResponse deleteAppTasks(@Param("app_id") String appId,
                                          @Param("host") String host, @Param("scale") String scale) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{app_id}/tasks/{task_id}?scale={scale}")
	DeleteAppTaskResponse deleteAppTask(@Param("app_id") String appId,
                                        @Param("task_id") String taskId, @Param("scale") String scale) throws ResponseException;

    // Groups
	@RequestLine("POST /v2/groups")
	Result createGroup(Group group) throws ResponseException;
	
	@RequestLine("DELETE /v2/groups/{id}")
	Result deleteGroup(@Param("id") String id) throws ResponseException;
	
	@RequestLine("GET /v2/groups/{id}")
	Group getGroup(@Param("id") String id) throws ResponseException;

    // Tasks

    // Deployments
	@RequestLine("GET /v2/deployments")
	List<Deployment> getDeployments() throws ResponseException;
	
	@RequestLine("DELETE /v2/deployments/{deploymentId}")
	void cancelDeploymentAndRollback(@Param("deploymentId") String id) throws ResponseException;
	
	@RequestLine("DELETE /v2/deployments/{deploymentId}?force=true")
	void cancelDeployment(@Param("deploymentId") String id) throws ResponseException;

    // Event Subscriptions
    @RequestLine("POST /v2/eventSubscriptions?callbackUrl={url}")
    public GetEventSubscriptionRegisterResponse register(@Param("url") String url) throws ResponseException;

    @RequestLine("DELETE /v2/eventSubscriptions?callbackUrl={url}")
    public GetEventSubscriptionRegisterResponse unregister(@Param("url") String url) throws ResponseException;

    @RequestLine("GET /v2/eventSubscriptions")
    public GetEventSubscriptionsResponse subscriptions() throws ResponseException;

    // Queue
	@RequestLine("GET /v2/queue")
	QueueResponse getQueue() throws ResponseException;

    // Server Info
    @RequestLine("GET /v2/info")
    GetServerInfoResponse getServerInfo() throws ResponseException;

    // Miscellaneous


}
