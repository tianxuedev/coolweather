package com.example.userlh.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by userLH on 2018/1/22.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
