/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.luigisummer.simplenettest.net.requests;

import com.luigisummer.simplenettest.net.base.Request;
import com.luigisummer.simplenettest.net.base.Response;

public class StringRequest extends Request<String> {

    public StringRequest(HttpMethod method, String url, RequestListener<String> listener) {
        super(method, url, listener);
    }

    @Override
    public String parseResponse(Response response) {
        return new String(response.getRawData());
    }

}
