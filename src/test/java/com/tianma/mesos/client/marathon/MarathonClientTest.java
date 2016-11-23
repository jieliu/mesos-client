package com.tianma.mesos.client.marathon;

import com.tianma.mesos.domain.marathon.v2.*;
import com.tianma.mesos.support.exception.ResponseException;
import org.junit.Test;

import java.util.List;

/**
 * Created by jie on 16-11-21.
 */
public class MarathonClientTest {

    private static final String endPoint = "http://112.74.77.115:8080";

    @Test
    public void testGetApps() {
        Marathon marathon = MarathonClient.getInstance(endPoint);

        try {
            GetAppsResponse appsResponse = marathon.getApps();
            System.out.print(appsResponse);
        } catch (ResponseException e) {

        }
    }

    @Test
    public void testGetTasks() {
        Marathon marathon = MarathonClient.getInstance(endPoint);

        try {
            GetTasksResponse tasksResponse = marathon.getTasks();
            System.out.print(tasksResponse);
        } catch (ResponseException e) {

        }
    }

    @Test
    public void testGetDeployment() {
        Marathon marathon = MarathonClient.getInstance(endPoint);

        try {
            List<Deployment> deployments = marathon.getDeployments();
            System.out.print(deployments);
        } catch (ResponseException e) {

        }
    }

    @Test
    public void testGetQueue() {
        Marathon marathon = MarathonClient.getInstance(endPoint);

        try {
            QueueResponse deployments = marathon.getQueue();
            System.out.print(deployments);
        } catch (ResponseException e) {

        }
    }

}