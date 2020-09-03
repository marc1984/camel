/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * Send requests to external HTTP servers using Vert.x
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VertxHttpEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Vert.x HTTP Client component.
     */
    public interface VertxHttpEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedVertxHttpEndpointBuilder advanced() {
            return (AdvancedVertxHttpEndpointBuilder) this;
        }
        /**
         * The amount of time in milliseconds until a connection is established.
         * A timeout value of zero is interpreted as an infinite timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default VertxHttpEndpointBuilder connectTimeout(int connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
        /**
         * The amount of time in milliseconds until a connection is established.
         * A timeout value of zero is interpreted as an infinite timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default VertxHttpEndpointBuilder connectTimeout(String connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
        /**
         * A custom CookieStore to use when session management is enabled. If
         * this option is not set then an in-memory CookieStore is used.
         * 
         * The option is a: <code>io.vertx.ext.web.client.spi.CookieStore</code>
         * type.
         * 
         * Default: InMemoryCookieStore
         * Group: producer
         */
        default VertxHttpEndpointBuilder cookieStore(Object cookieStore) {
            doSetProperty("cookieStore", cookieStore);
            return this;
        }
        /**
         * A custom CookieStore to use when session management is enabled. If
         * this option is not set then an in-memory CookieStore is used.
         * 
         * The option will be converted to a
         * <code>io.vertx.ext.web.client.spi.CookieStore</code> type.
         * 
         * Default: InMemoryCookieStore
         * Group: producer
         */
        default VertxHttpEndpointBuilder cookieStore(String cookieStore) {
            doSetProperty("cookieStore", cookieStore);
            return this;
        }
        /**
         * A custom org.apache.camel.spi.HeaderFilterStrategy to filter header
         * to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Default: VertxHttpHeaderFilterStrategy
         * Group: producer
         */
        default VertxHttpEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * A custom org.apache.camel.spi.HeaderFilterStrategy to filter header
         * to and from Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Default: VertxHttpHeaderFilterStrategy
         * Group: producer
         */
        default VertxHttpEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The HTTP method to use. The HttpMethod header cannot override this
         * option if set.
         * 
         * The option is a: <code>io.vertx.core.http.HttpMethod</code> type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder httpMethod(HttpMethod httpMethod) {
            doSetProperty("httpMethod", httpMethod);
            return this;
        }
        /**
         * The HTTP method to use. The HttpMethod header cannot override this
         * option if set.
         * 
         * The option will be converted to a
         * <code>io.vertx.core.http.HttpMethod</code> type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder httpMethod(String httpMethod) {
            doSetProperty("httpMethod", httpMethod);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The status codes which are considered a success response. The values
         * are inclusive. Multiple ranges can be defined, separated by comma,
         * e.g. 200-204,209,301-304. Each range must be a single number or
         * from-to with the dash included.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: 200-299
         * Group: producer
         */
        default VertxHttpEndpointBuilder okStatusCodeRange(
                String okStatusCodeRange) {
            doSetProperty("okStatusCodeRange", okStatusCodeRange);
            return this;
        }
        /**
         * Enables session management via WebClientSession. By default the
         * client is configured to use an in-memory CookieStore. The cookieStore
         * option can be used to override this.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder sessionManagement(
                boolean sessionManagement) {
            doSetProperty("sessionManagement", sessionManagement);
            return this;
        }
        /**
         * Enables session management via WebClientSession. By default the
         * client is configured to use an in-memory CookieStore. The cookieStore
         * option can be used to override this.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder sessionManagement(
                String sessionManagement) {
            doSetProperty("sessionManagement", sessionManagement);
            return this;
        }
        /**
         * Disable throwing HttpOperationFailedException in case of failed
         * responses from the remote server.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default VertxHttpEndpointBuilder throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            doSetProperty("throwExceptionOnFailure", throwExceptionOnFailure);
            return this;
        }
        /**
         * Disable throwing HttpOperationFailedException in case of failed
         * responses from the remote server.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default VertxHttpEndpointBuilder throwExceptionOnFailure(
                String throwExceptionOnFailure) {
            doSetProperty("throwExceptionOnFailure", throwExceptionOnFailure);
            return this;
        }
        /**
         * The amount of time in milliseconds after which if the request does
         * not return any data within the timeout period a TimeoutException
         * fails the request. Setting zero or a negative value disables the
         * timeout.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default VertxHttpEndpointBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The amount of time in milliseconds after which if the request does
         * not return any data within the timeout period a TimeoutException
         * fails the request. Setting zero or a negative value disables the
         * timeout.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default VertxHttpEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was sent back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Camel will deserialize the incoming
         * data from the request to a Java object, which can be a potential
         * security risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder transferException(
                boolean transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was sent back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Camel will deserialize the incoming
         * data from the request to a Java object, which can be a potential
         * security risk.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder transferException(
                String transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * Set whether compression is enabled to handled compressed (E.g
         * gzipped) responses.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder useCompression(boolean useCompression) {
            doSetProperty("useCompression", useCompression);
            return this;
        }
        /**
         * Set whether compression is enabled to handled compressed (E.g
         * gzipped) responses.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VertxHttpEndpointBuilder useCompression(String useCompression) {
            doSetProperty("useCompression", useCompression);
            return this;
        }
        /**
         * A custom VertxHttpBinding which can control how to bind between
         * Vert.x and Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.component.vertx.http.VertxHttpBinding</code>
         * type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder vertxHttpBinding(
                Object vertxHttpBinding) {
            doSetProperty("vertxHttpBinding", vertxHttpBinding);
            return this;
        }
        /**
         * A custom VertxHttpBinding which can control how to bind between
         * Vert.x and Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.vertx.http.VertxHttpBinding</code>
         * type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder vertxHttpBinding(
                String vertxHttpBinding) {
            doSetProperty("vertxHttpBinding", vertxHttpBinding);
            return this;
        }
        /**
         * Sets customized options for configuring the Vert.x WebClient.
         * 
         * The option is a:
         * <code>io.vertx.ext.web.client.WebClientOptions</code> type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder webClientOptions(
                Object webClientOptions) {
            doSetProperty("webClientOptions", webClientOptions);
            return this;
        }
        /**
         * Sets customized options for configuring the Vert.x WebClient.
         * 
         * The option will be converted to a
         * <code>io.vertx.ext.web.client.WebClientOptions</code> type.
         * 
         * Group: producer
         */
        default VertxHttpEndpointBuilder webClientOptions(
                String webClientOptions) {
            doSetProperty("webClientOptions", webClientOptions);
            return this;
        }
        /**
         * The proxy server host address.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy server password if authentication is required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * The proxy server port.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy server port.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy server type.
         * 
         * The option is a: <code>io.vertx.core.net.ProxyType</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyType(ProxyType proxyType) {
            doSetProperty("proxyType", proxyType);
            return this;
        }
        /**
         * The proxy server type.
         * 
         * The option will be converted to a
         * <code>io.vertx.core.net.ProxyType</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyType(String proxyType) {
            doSetProperty("proxyType", proxyType);
            return this;
        }
        /**
         * The proxy server username if authentication is required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default VertxHttpEndpointBuilder proxyUsername(String proxyUsername) {
            doSetProperty("proxyUsername", proxyUsername);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpEndpointBuilder basicAuthPassword(
                String basicAuthPassword) {
            doSetProperty("basicAuthPassword", basicAuthPassword);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpEndpointBuilder basicAuthUsername(
                String basicAuthUsername) {
            doSetProperty("basicAuthUsername", basicAuthUsername);
            return this;
        }
        /**
         * The bearer token to use for bearer token authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default VertxHttpEndpointBuilder bearerToken(String bearerToken) {
            doSetProperty("bearerToken", bearerToken);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxHttpEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default VertxHttpEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Vert.x HTTP Client component.
     */
    public interface AdvancedVertxHttpEndpointBuilder
            extends
                EndpointProducerBuilder {
        default VertxHttpEndpointBuilder basic() {
            return (VertxHttpEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedVertxHttpEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedVertxHttpEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedVertxHttpEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedVertxHttpEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>io.vertx.core.http.HttpMethod</code> enum.
     */
    enum HttpMethod {
        OPTIONS,
        GET,
        HEAD,
        POST,
        PUT,
        DELETE,
        TRACE,
        CONNECT,
        PATCH,
        OTHER;
    }

    /**
     * Proxy enum for <code>io.vertx.core.net.ProxyType</code> enum.
     */
    enum ProxyType {
        HTTP,
        SOCKS4,
        SOCKS5;
    }

    public interface VertxHttpBuilders {
        /**
         * Vert.x HTTP Client (camel-vertx-http)
         * Send requests to external HTTP servers using Vert.x
         * 
         * Category: http
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-http
         * 
         * Syntax: <code>vertx-http:httpUri</code>
         * 
         * Path parameter: httpUri (required)
         * The HTTP URI to connect to
         * 
         * @param path httpUri
         */
        default VertxHttpEndpointBuilder vertxHttp(String path) {
            return VertxHttpEndpointBuilderFactory.endpointBuilder("vertx-http", path);
        }
        /**
         * Vert.x HTTP Client (camel-vertx-http)
         * Send requests to external HTTP servers using Vert.x
         * 
         * Category: http
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-http
         * 
         * Syntax: <code>vertx-http:httpUri</code>
         * 
         * Path parameter: httpUri (required)
         * The HTTP URI to connect to
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path httpUri
         */
        default VertxHttpEndpointBuilder vertxHttp(
                String componentName,
                String path) {
            return VertxHttpEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static VertxHttpEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class VertxHttpEndpointBuilderImpl extends AbstractEndpointBuilder implements VertxHttpEndpointBuilder, AdvancedVertxHttpEndpointBuilder {
            public VertxHttpEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new VertxHttpEndpointBuilderImpl(path);
    }
}