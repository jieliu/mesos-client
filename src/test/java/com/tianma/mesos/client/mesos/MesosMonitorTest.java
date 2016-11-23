package com.tianma.mesos.client.mesos;

import com.tianma.mesos.domain.mesos.v1.GetSlavesResponse;
import com.tianma.mesos.domain.mesos.v1.MesosVersion;
import com.tianma.mesos.domain.mesos.v1.StateSummary;
import com.tianma.mesos.domain.mesos.v1.SystemStats;
import com.tianma.mesos.support.exception.ResponseException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jie on 16-11-23.
 */
public class MesosMonitorTest {
    private static final String endPoint = "http://112.74.77.115:5050";

    @Test
    public void getVersion() {

        MesosMonitor mesosMonitor = MesosMonitorClient.getInstance(endPoint);
        try {
            MesosVersion versionResponse = mesosMonitor.getVersion();
            System.out.println(versionResponse);
        } catch (ResponseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getSystemStats() {

        MesosMonitor mesosMonitor = MesosMonitorClient.getInstance(endPoint);

        try {
            SystemStats masterSystemStats = mesosMonitor.getMasterSystemStats();
            System.out.println(masterSystemStats);
        } catch (ResponseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getSlavesResponse() {
        MesosMonitor mesosMonitor = MesosMonitorClient.getInstance(endPoint);

        try {
            GetSlavesResponse getSlavesResponse = mesosMonitor.getMasterSlaves();
            System.out.println(getSlavesResponse);
            System.out.println("------------------------------------------------------------");
            System.out.println(getSlavesResponse.getSlaves().get(0).getHostname());
        } catch (ResponseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetStateSummary() {
        MesosMonitor mesosMonitor = MesosMonitorClient.getInstance(endPoint);

        try {
            StateSummary getSlavesResponse = mesosMonitor.getStateSummary();
            System.out.println(getSlavesResponse);
            System.out.println("------------------------------------------------------------");
            System.out.println(getSlavesResponse.getSlaves().get(0).getResources().getCpus());
        } catch (ResponseException e) {
            e.printStackTrace();
        }
    }

}