package com.tianma.mesos.domain.marathon.v2;

import com.tianma.mesos.support.util.ModelUtils;

import java.util.Collection;

public class DeleteAppTasksResponse {
	private Collection<Task> tasks;

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

}
