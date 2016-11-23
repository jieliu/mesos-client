package com.tianma.mesos.client.mesos;

import com.tianma.mesos.auth.TokenAuthRequestInterceptor;
import com.tianma.mesos.support.exception.ResponseException;
import com.tianma.mesos.support.util.ModelUtils;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Response;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

import static java.util.Arrays.asList;

/**
 * Created by jie on 16-11-18.
 */
public class MesosMonitorClient {
    static class MesosMonitorHeadersInterceptor implements RequestInterceptor {
        @Override
        public void apply(RequestTemplate template) {
            template.header("Accept", "application/json");
            template.header("Content-Type", "application/json");
        }
    }

    static class MesosMonitorErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {
            return new ResponseException(response.status(), response.reason());
        }
    }

    public static MesosMonitor getInstance(String endpoint) {
        return getInstance(endpoint, null);
    }

    /**
     * The generalized version of the method that allows more in-depth customizations via
     * {@link RequestInterceptor}s.
     *
     * @param endpoint
     * 		URL of MesosMonitor
     */
    public static MesosMonitor getInstance(String endpoint, RequestInterceptor... interceptors) {
        Feign.Builder b = Feign.builder()
                .encoder(new GsonEncoder(ModelUtils.GSON))
                .decoder(new GsonDecoder(ModelUtils.GSON))
                .errorDecoder(new MesosMonitorClient.MesosMonitorErrorDecoder());
        if (interceptors!=null)
            b.requestInterceptors(asList(interceptors));
        b.requestInterceptor(new MesosMonitorClient.MesosMonitorHeadersInterceptor());
        return b.target(MesosMonitor.class, endpoint);
    }

    /**
     * Creates a MesosMonitor client proxy that performs HTTP basic authentication.
     */
    public static MesosMonitor getInstanceWithBasicAuth(String endpoint, String username, String password) {
        return getInstance(endpoint,new BasicAuthRequestInterceptor(username,password));
    }

    /**
     * Creates a MesosMonitor client proxy that uses a token for authentication.
     *
     * @param endpoint URL of MesosMonitor
     * @param token token
     * @return MesosMonitor client
     */
    public static MesosMonitor getInstanceWithTokenAuth(String endpoint, String token) {
        return getInstance(endpoint, new TokenAuthRequestInterceptor(token));
    }
}
