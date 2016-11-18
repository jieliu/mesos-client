package com.tianma.mesos.domain.marathon.v2;

import com.egoo.linkcloud.mesos.support.util.ModelUtils;

import java.util.List;

public class GetAppsResponse {
	private List<App> apps;

	public List<App> getApps() {
		return apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

}
