package com.example.android.appslyandroidrest.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import ly.apps.android.rest.client.Callback;
import ly.apps.android.rest.client.Response;
import ly.apps.android.rest.client.RestClient;
import ly.apps.android.rest.client.RestClientFactory;
import ly.apps.android.rest.client.RestServiceFactory;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Seattle
        double latitude = 47.663267;
        double longitude = -122.384187;
        getForecast("http://api.openweathermap.org/data/2.5", latitude, longitude);
    }

    protected void getForecast(String baseUrl, double latitude, double longitude) {
        RestClient restClient = RestClientFactory.defaultClient(this);
        OpenWeatherApi api = RestServiceFactory.getService(baseUrl, OpenWeatherApi.class, restClient);
        api.getForecast(latitude, longitude, new Callback<ForecastResponse>() {
            @Override
            public void onResponse(Response<ForecastResponse> forecastResponse) {
                Log.i(getClass().getName(), "Response: " + forecastResponse.getResult());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
