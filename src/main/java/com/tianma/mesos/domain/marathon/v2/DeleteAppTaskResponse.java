package com.tianma.mesos.domain.marathon.v2;

import com.egoo.linkcloud.mesos.support.util.ModelUtils;

public class DeleteAppTaskResponse {
	private Task task;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

}
