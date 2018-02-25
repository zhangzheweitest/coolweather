package com.example.zhangzhewei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangzhewei on 2018/2/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
