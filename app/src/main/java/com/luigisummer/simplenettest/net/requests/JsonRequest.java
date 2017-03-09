/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.luigisummer.simplenettest.net.requests;

import org.json.JSONException;
import org.json.JSONObject;

import com.luigisummer.simplenettest.net.base.Request;
import com.luigisummer.simplenettest.net.base.Response;

/**
 * 返回的数据类型为Json的请求, Json对应的对象类型为JSONObject
 * 
 * @author mrsimple
 */
public class JsonRequest extends Request<JSONObject> {

    public JsonRequest(HttpMethod method, String url, RequestListener<JSONObject> listener) {
        super(method, url, listener);
    }

    
    /**
     * 将Response的结果转换为JSONObject
     */
    @Override
    public JSONObject parseResponse(Response response) {
        String jsonString = new String(response.getRawData());
        try {
            return new JSONObject(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
