package com.example.userlh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by userLH on 2018/1/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temprature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
