package com.example.zhangzhewei.coolweather.gson;

/**
 * Created by zhangzhewei on 2018/2/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
