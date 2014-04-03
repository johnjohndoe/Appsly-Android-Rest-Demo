package com.example.android.appslyandroidrest.demo.model;


public class Coord {

    private static final String FIELD_LON = "lon";
    private static final String FIELD_LAT = "lat";


    private double mLon;
    private double mLat;


    public Coord() {

    }

    public void setLon(double lon) {
        mLon = lon;
    }

    public double getLon() {
        return mLon;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public double getLat() {
        return mLat;
    }

    @Override
    public String toString() {
        return "lat = " + mLat + ", lon = " + mLon;
    }
}