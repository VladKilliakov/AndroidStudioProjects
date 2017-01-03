package com.example.android.quakereport;

/**
 * Created by kilvl on 11/2/2016.
 */

public class EarthquakeReport {

    private double mMagnitude;
    private  long mDate;
    private String mLocation;
    private  String mUrl;

    public EarthquakeReport(double Magnitude, String Location, long Date, String Url){
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
        mUrl = Url;
    }

    public  double getMagnitude(){
        return mMagnitude;
    }

    public  String getLocation(){
        return mLocation;
    }

    public String getUrl(){
        return mUrl;
    }

    public long getDate(){
        return mDate;
    }
}
