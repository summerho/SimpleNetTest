/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.luigisummer.simplenettest.net.config;

import org.apache.http.conn.ssl.SSLSocketFactory;


/**
 * 这是针对于使用HttpClientStack执行请求时为https请求配置的SSLSocketFactory类
 * 
 * @author mrsimple
 */
public class HttpClientConfig extends HttpConfig {
    private static HttpClientConfig sConfig = new HttpClientConfig();
    SSLSocketFactory mSslSocketFactory;

    private HttpClientConfig() {

    }

    public static HttpClientConfig getConfig() {
        return sConfig;
    }

    /**
     * 配置https请求的SSLSocketFactory与HostnameVerifier
     * 
     * @param sslSocketFactory
     * @param hostnameVerifier
     */
    public void setHttpsConfig(SSLSocketFactory sslSocketFactory) {
        mSslSocketFactory = sslSocketFactory;
    }

    public SSLSocketFactory getSocketFactory() {
        return mSslSocketFactory;
    }
}