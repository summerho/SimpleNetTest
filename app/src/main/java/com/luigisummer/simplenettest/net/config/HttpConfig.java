/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.luigisummer.simplenettest.net.config;

/**
 * http配置类
 * 
 * @author mrsimple
 */
public abstract class HttpConfig {
    public String userAgent = "default";
    public int soTimeOut = 10000;
    public int connTimeOut = 10000;
}
