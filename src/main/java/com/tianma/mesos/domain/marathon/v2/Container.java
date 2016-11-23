package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.MarathonModelUtils;

import java.util.Collection;

public class Container {
	private String type;
	private Docker docker;
	private Collection<Volume> volumes;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Docker getDocker() {
		return docker;
	}

	public void setDocker(Docker docker) {
		this.docker = docker;
	}

	public Collection<Volume> getVolumes() {
		return volumes;
	}

	public void setVolumes(Collection<Volume> volumes) {
		this.volumes = volumes;
	}

	@Override
	public String toString() {
		return MarathonModelUtils.toString(this);
	}
}
