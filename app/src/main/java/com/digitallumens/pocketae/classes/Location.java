package com.digitallumens.pocketae.classes;

/**
 * Created by ysmith on 3/12/15.
 */
public class Location {
    //this class will pull information from the Google Maps API

    private String mCommonName;
    private String mFromLocation;
    private String mToLocation;

    //Constructors for the Location Class

    public Location (){
        mCommonName = null;
        mFromLocation = null;
        mToLocation = null;
    }

    public String getCommonName() {
        /*here is where we need to be able to pull data from the Google Maps API in order to
        be able to translate the name provided by the user into lat/long coordinates that Google
        will understand
        */
        return mCommonName;
    }

    public void setCommonName(String commonName) {
        mCommonName = commonName;
    }

    public String getFromLocation() {
        return mFromLocation;
    }

    public void setFromLocation(String fromLocation) {
        mFromLocation = fromLocation;
    }

    public String getToLocation() {
        return mToLocation;
    }

    public void setToLocation(String toLocation) {
        mToLocation = toLocation;
    }
}
