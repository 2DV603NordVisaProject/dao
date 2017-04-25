package org.nordvisa.eventcalendar.Event;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.PendingResult;
import com.google.maps.model.GeocodingResult;

import java.util.Arrays;

public class EventLocation {

    private double longitude;
    private double latitude;
    private String address;
    private String country;
    private String region;
    private String description;

    public EventLocation() {

    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void geoCode() {

        // Temporary API key
        final String API_KEY = "AIzaSyAM9tW28Kcfem-zAIyyPnnPnyqL1WY5TGo";

        GeoApiContext context = new GeoApiContext().setApiKey(API_KEY);
        GeocodingApiRequest request = GeocodingApi.newRequest(context).address(this.address);

        try {
            GeocodingResult[] results = request.await();
            setLatitude(results[0].geometry.location.lat);
            setLongitude(results[0].geometry.location.lng);
            setAddress(results[0].formattedAddress);
        } catch (Exception e) {
            // Handle error
        }

        // Async variant
        /*request.setCallback(new PendingResult.Callback<GeocodingResult[]>() {
            @Override
            public void onResult(GeocodingResult[] results) {
                setLatitude(results[0].geometry.location.lat);
                setLongitude(results[0].geometry.location.lng);
            }

            @Override
            public void onFailure(Throwable e) {
                // Handle error.
            }
        });*/

    }
}