package com.example.android.appslyandroidrest.demo.model;


public class Weather {

    private static final String FIELD_ID = "id";
    private static final String FIELD_ICON = "icon";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_MAIN = "main";


    private long mId;
    private String mIcon;
    private String mDescription;
    private String mMain;


    public Weather() {

    }

    public void setId(long id) {
        mId = id;
    }

    public long getId() {
        return mId;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setMain(String main) {
        mMain = main;
    }

    public String getMain() {
        return mMain;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Weather) {
            return ((Weather) obj).getId() == mId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((Long) mId).hashCode();
    }

    @Override
    public String toString() {
        return "main = " + mMain;
    }
}