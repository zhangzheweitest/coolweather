package com.example.zhangzhewei.coolweather.gson;

/**
 * Created by zhangzhewei on 2018/2/23.
 */

import com.google.gson.annotations.SerializedName;



import java.util.List;



public class Weather {



    public String status;



    public Basic basic;



    public AQI aqi;



    public Now now;



    public Suggestion suggestion;



    @SerializedName("daily_forecast")

    public List<Forecast> forecastList;



}