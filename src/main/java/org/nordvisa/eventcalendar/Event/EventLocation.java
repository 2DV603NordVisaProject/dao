package org.nordvisa.eventcalendar.Event;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.model.AddressComponent;
import com.google.maps.model.GeocodingResult;

public class EventLocation {

    private double longitude;
    private double latitude;
    private String address;
    private String parsedAddress;
    private String postalCode;
    private String city;
    private String country;

    @JsonIgnore
    private String region;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParsedAddress() {
        return parsedAddress;
    }

    public void setParsedAddress(String parsedAddress) {
        this.parsedAddress = parsedAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
            setAddress(this.address);
            setParsedAddress(results[0].formattedAddress);

            for (AddressComponent addressComponent : results[0].addressComponents) {
                switch (addressComponent.types[0]) {
                    case POSTAL_CODE:
                        // Remove any white space from postal code
                        String postalCode = addressComponent.longName
                                .replaceAll("\\s+","");
                        setPostalCode(postalCode);
                        break;
                    case LOCALITY:
                        setCity(addressComponent.longName);
                        break;
                    case POSTAL_TOWN:
                        setCity(addressComponent.longName);
                        break;
                    case COUNTRY:
                        setCountry(addressComponent.shortName);
                        break;
                    default:
                        break;
                }
            }

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
