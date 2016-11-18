package com.tianma.mesos.domain.marathon.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.Collection;

public class GetGroupsResponse {
	private Collection<Group> groups;
	
	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
