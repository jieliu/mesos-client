package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.MarathonModelUtils;

public class GetAppResponse {
	private App app;

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	@Override
	public String toString() {
		return MarathonModelUtils.toString(this);
	}
}
