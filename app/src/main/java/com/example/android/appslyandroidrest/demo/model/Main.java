package com.example.android.appslyandroidrest.demo.model;


public class Main {

    private static final String FIELD_TEMP = "temp";
    private static final String FIELD_TEMP_MAX = "temp_max";
    private static final String FIELD_PRESSURE = "pressure";
    private static final String FIELD_HUMIDITY = "humidity";
    private static final String FIELD_TEMP_MIN = "temp_min";


    private double mTemp;
    private double mTempMax;
    private int mPressure;
    private int mHumidity;
    private double mTempMin;


    public Main() {

    }

    public void setTemp(double temp) {
        mTemp = temp;
    }

    public double getTemp() {
        return mTemp;
    }

    public void setTempMax(double tempMax) {
        mTempMax = tempMax;
    }

    public double getTempMax() {
        return mTempMax;
    }

    public void setPressure(int pressure) {
        mPressure = pressure;
    }

    public int getPressure() {
        return mPressure;
    }

    public void setHumidity(int humidity) {
        mHumidity = humidity;
    }

    public int getHumidity() {
        return mHumidity;
    }

    public void setTempMin(double tempMin) {
        mTempMin = tempMin;
    }

    public double getTempMin() {
        return mTempMin;
    }

    @Override
    public String toString() {
        return "temp = " + mTemp + ", humidity = " + mHumidity + ", pressure = " + mPressure;
    }
}