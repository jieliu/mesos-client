package com.tianma.mesos.domain.mesos.v1;

import com.google.gson.annotations.SerializedName;
import com.tianma.mesos.support.util.ModelUtils;

/**
 * Created by jie on 16-11-18.
 */
public class MesosVersion {

    @SerializedName("build_date")
    private String buildDate;

    @SerializedName("build_time")
    private String buildTime;

    @SerializedName("build_user")
    private String buildUser;

    private String version;

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {

        return ModelUtils.toString(this);
    }

}
