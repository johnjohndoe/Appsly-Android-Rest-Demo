package com.example.android.appslyandroidrest.demo.model;


public class Sy {

    private static final String FIELD_SUNSET = "sunset";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_SUNRISE = "sunrise";


    private int mSunset;
    private String mCountry;
    private double mMessage;
    private int mSunrise;


    public Sy() {

    }

    public void setSunset(int sunset) {
        mSunset = sunset;
    }

    public int getSunset() {
        return mSunset;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setMessage(double message) {
        mMessage = message;
    }

    public double getMessage() {
        return mMessage;
    }

    public void setSunrise(int sunrise) {
        mSunrise = sunrise;
    }

    public int getSunrise() {
        return mSunrise;
    }


}