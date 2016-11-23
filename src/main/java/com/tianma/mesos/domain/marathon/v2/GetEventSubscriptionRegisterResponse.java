package com.tianma.mesos.domain.marathon.v2;


import com.tianma.mesos.support.util.MarathonModelUtils;

public class GetEventSubscriptionRegisterResponse {

    private String callbackUrl;
    private String clientIp;
    private String eventType;

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    public void setCallbackUrl(final String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
    public String getClientIp() {
        return this.clientIp;
    }
    public void setClientIp(final String clientIp) {
        this.clientIp = clientIp;
    }
    public String getEventType() {
        return this.eventType;
    }
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return MarathonModelUtils.toString(this);
    }
}
