package com.example.android.appslyandroidrest.demo.model;


public class Wind {

    private static final String FIELD_DEG = "deg";
    private static final String FIELD_GUST = "gust";
    private static final String FIELD_SPEED = "speed";


    private int mDeg;
    private double mGust;
    private double mSpeed;


    public Wind() {

    }

    public void setDeg(int deg) {
        mDeg = deg;
    }

    public int getDeg() {
        return mDeg;
    }

    public void setGust(double gust) {
        mGust = gust;
    }

    public double getGust() {
        return mGust;
    }

    public void setSpeed(double speed) {
        mSpeed = speed;
    }

    public double getSpeed() {
        return mSpeed;
    }

    @Override
    public String toString() {
        return "deg = " + mDeg + ", gust = " + mGust + ", speed = " + mSpeed;
    }
}