package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.MarathonModelUtils;

public class Result {
	private String version;
	private String deploymentId;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	@Override
	public String toString() {
		return MarathonModelUtils.toString(this);
	}
}
