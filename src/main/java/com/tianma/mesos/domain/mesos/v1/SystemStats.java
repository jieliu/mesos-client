package com.tianma.mesos.domain.mesos.v1;

import com.google.gson.annotations.SerializedName;
import com.tianma.mesos.support.util.MesosModelUtils;

/**
 * Created by jie on 16-11-18.
 */
public class SystemStats {

    @SerializedName("avg_load_15min")
    private double avgLoad15min;

    @SerializedName("avg_load_1min")
    private double avgLoad1min;

    @SerializedName("avg_load_5min")
    private double avgLoad5min;

    @SerializedName("cpus_total")
    private int cpusTotal;

    @SerializedName("mem_free_bytes")
    private long memFreeBytes;

    @SerializedName("mem_total_bytes")
    private long memTotalBytes;

    public double getAvgLoad15min() {
        return avgLoad15min;
    }

    public void setAvgLoad15min(double avgLoad15min) {
        this.avgLoad15min = avgLoad15min;
    }

    public double getAvgLoad1min() {
        return avgLoad1min;
    }

    public void setAvgLoad1min(double avgLoad1min) {
        this.avgLoad1min = avgLoad1min;
    }

    public double getAvgLoad5min() {
        return avgLoad5min;
    }

    public void setAvgLoad5min(double avgLoad5min) {
        this.avgLoad5min = avgLoad5min;
    }

    public int getCpusTotal() {
        return cpusTotal;
    }

    public void setCpusTotal(int cpusTotal) {
        this.cpusTotal = cpusTotal;
    }

    public long getMemFreeBytes() {
        return memFreeBytes;
    }

    public void setMemFreeBytes(long memFreeBytes) {
        this.memFreeBytes = memFreeBytes;
    }

    public long getMemTotalBytes() {
        return memTotalBytes;
    }

    public void setMemTotalBytes(long memTotalBytes) {
        this.memTotalBytes = memTotalBytes;
    }

    @Override
    public String toString() {

        return MesosModelUtils.toString(this);
    }
}
