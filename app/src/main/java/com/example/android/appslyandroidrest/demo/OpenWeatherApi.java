package com.example.android.appslyandroidrest.demo;

import ly.apps.android.rest.client.Callback;
import ly.apps.android.rest.client.annotations.GET;
import ly.apps.android.rest.client.annotations.QueryParam;
import ly.apps.android.rest.client.annotations.RestService;

@RestService
public interface OpenWeatherApi {

    @GET("/weather")
    void getForecast(@QueryParam("lat") double latitude,
                     @QueryParam("lon") double longitude,
                     Callback<ForecastResponse> callback);

}
