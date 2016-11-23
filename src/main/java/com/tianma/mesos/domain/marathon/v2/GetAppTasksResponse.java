package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.MarathonModelUtils;

import java.util.Collection;

public class GetAppTasksResponse {
	private Collection<Task> tasks;

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return MarathonModelUtils.toString(this);
	}
}
