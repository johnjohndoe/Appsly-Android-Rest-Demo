package com.example.android.appslyandroidrest.demo;

import com.example.android.appslyandroidrest.demo.model.Cloud;
import com.example.android.appslyandroidrest.demo.model.Coord;
import com.example.android.appslyandroidrest.demo.model.Main;
import com.example.android.appslyandroidrest.demo.model.Sy;
import com.example.android.appslyandroidrest.demo.model.Weather;
import com.example.android.appslyandroidrest.demo.model.Wind;

import java.util.List;


public class ForecastResponse {

    private static final String FIELD_ID = "id";
    private static final String FIELD_COD = "cod";
    private static final String FIELD_WIND = "wind";
    private static final String FIELD_SYS = "sys";
    private static final String FIELD_BASE = "base";
    private static final String FIELD_DT = "dt";
    private static final String FIELD_COORD = "coord";
    private static final String FIELD_WEATHER = "weather";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_MAIN = "main";
    private static final String FIELD_CLOUDS = "clouds";


    private long mId;
    private int mCod;
    private Wind mWind;
    private Sy mSy;
    private String mBase;
    private int mDt;
    private Coord mCoord;
    private List<Weather> mWeathers;
    private String mName;
    private Main mMain;
    private Cloud mCloud;


    public ForecastResponse() {

    }

    public void setId(long id) {
        mId = id;
    }

    public long getId() {
        return mId;
    }

    public void setCod(int cod) {
        mCod = cod;
    }

    public int getCod() {
        return mCod;
    }

    public void setWind(Wind wind) {
        mWind = wind;
    }

    public Wind getWind() {
        return mWind;
    }

    public void setSy(Sy sy) {
        mSy = sy;
    }

    public Sy getSy() {
        return mSy;
    }

    public void setBase(String base) {
        mBase = base;
    }

    public String getBase() {
        return mBase;
    }

    public void setDt(int dt) {
        mDt = dt;
    }

    public int getDt() {
        return mDt;
    }

    public void setCoord(Coord coord) {
        mCoord = coord;
    }

    public Coord getCoord() {
        return mCoord;
    }

    public void setWeathers(List<Weather> weathers) {
        mWeathers = weathers;
    }

    public List<Weather> getWeathers() {
        return mWeathers;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setMain(Main main) {
        mMain = main;
    }

    public Main getMain() {
        return mMain;
    }

    public void setCloud(Cloud cloud) {
        mCloud = cloud;
    }

    public Cloud getCloud() {
        return mCloud;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ForecastResponse) {
            return ((ForecastResponse) obj).getId() == mId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((Long) mId).hashCode();
    }

    @Override
    public String toString() {
        return mName + "; " + mMain + "; " + mCoord + "; " + mWind + "; " + mWeathers;
    }
}