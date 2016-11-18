package com.tianma.mesos.domain.marathon.v2;

import com.egoo.linkcloud.mesos.support.util.ModelUtils;

import java.util.Collection;

public class QueueResponse {

    private Collection<QueueElement> queue;

    public Collection<QueueElement> getQueue() {
        return queue;
    }

    public void setQueue(Collection<QueueElement> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
