package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.MarathonModelUtils;

import java.util.List;

public class GetDeploymentsResponse {
	private List<Deployment> deployments;

	public List<Deployment> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}
	
	@Override
	public String toString() {
		return MarathonModelUtils.toString(this);
	}
}
