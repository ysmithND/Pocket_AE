package com.digitallumens.pocketae.classes;

/**
 * Created by ysmith on 3/12/15.
 */
public class Weather {
    /* purpose of this class is to create, read, update and delete (CRUD) weather objects. This class
    relies on the OpenWeather API in order to collect and disseminate accurate data. A complete
    weather object will be include weather data (defined and parsed through API), location and
    a message for users.
     */
    //class member variables
    private Location mLocation;
    private String mMessage;
    private int mWeatherID;

    //constructors here
    public Weather (Location location){
        mWeatherID = 0;
        mLocation = location;
        mMessage = null;
    }

    //methods here
    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public int getWeatherID() {
        return mWeatherID;
    }

    public void setWeatherID(int weatherID) {
        mWeatherID = weatherID;
    }
    // Create Weather Object
    public void createWeather(Location location){

    }
    // Read Weather Object
    public void getWeather(int id){

    }
    // Update Weather Object
    public Weather updateWeather (Weather weather, Location newLocation){
        //1. Get old weather object
        int oldWeatherID = weather.getWeatherID();
        Location oldLocation = weather.getLocation();
        weather.setLocation(newLocation);

        //some shit about changing the message
        mMessage = "Some new text";
        return weather;
    }
    // Delete Weather Object
    public void deleteWeather (int id){

    }
}
