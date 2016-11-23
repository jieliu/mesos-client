package com.tianma.mesos.client.mesos;

import com.tianma.mesos.auth.TokenAuthRequestInterceptor;
import com.tianma.mesos.support.exception.ResponseException;
import com.tianma.mesos.support.util.MesosModelUtils;
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
 * Created by jie on 16-11-17.
 */
public class MesosClient {
    static class MesosHeadersInterceptor implements RequestInterceptor {
        @Override
        public void apply(RequestTemplate template) {
            template.header("Accept", "application/json");
            template.header("Content-Type", "application/json");
        }
    }

    static class MesosErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {
            return new ResponseException(response.status(), response.reason());
        }
    }

    public static Mesos getInstance(String endpoint) {
        return getInstance(endpoint, null);
    }

    /**
     * The generalized version of the method that allows more in-depth customizations via
     * {@link RequestInterceptor}s.
     *
     * @param endpoint
     * 		URL of Mesos
     */
    public static Mesos getInstance(String endpoint, RequestInterceptor... interceptors) {
        Feign.Builder b = Feign.builder()
                .encoder(new GsonEncoder(MesosModelUtils.GSON))
                .decoder(new GsonDecoder(MesosModelUtils.GSON))
                .errorDecoder(new MesosClient.MesosErrorDecoder());
        if (interceptors!=null)
            b.requestInterceptors(asList(interceptors));
        b.requestInterceptor(new MesosClient.MesosHeadersInterceptor());
        return b.target(Mesos.class, endpoint);
    }

    /**
     * Creates a Mesos client proxy that performs HTTP basic authentication.
     */
    public static Mesos getInstanceWithBasicAuth(String endpoint, String username, String password) {
        return getInstance(endpoint,new BasicAuthRequestInterceptor(username,password));
    }

    /**
     * Creates a Mesos client proxy that uses a token for authentication.
     *
     * @param endpoint URL of Mesos
     * @param token token
     * @return Mesos client
     */
    public static Mesos getInstanceWithTokenAuth(String endpoint, String token) {
        return getInstance(endpoint, new TokenAuthRequestInterceptor(token));
    }
}
