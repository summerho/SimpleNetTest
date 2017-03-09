/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.luigisummer.simplenettest.net.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import com.luigisummer.simplenettest.net.base.Request;
import com.luigisummer.simplenettest.net.base.Response;

/**
 * 请求结果投递类,将请求结果投递给UI线程
 * 
 * @author mrsimple
 */
class ResponseDelivery implements Executor {

    /**
     * 主线程的hander
     */
    Handler mResponseHandler = new Handler(Looper.getMainLooper());

    /**
     * 处理请求结果,将其执行在UI线程
     * 
     * @param request
     * @param response
     */
    public void deliveryResponse(final Request<?> request, final Response response) {
        Runnable respRunnable = new Runnable() {

            @Override
            public void run() {
                request.deliveryResponse(response);
            }
        };

        execute(respRunnable);
    }

    @Override
    public void execute(Runnable command) {
        mResponseHandler.post(command);
    }

}
