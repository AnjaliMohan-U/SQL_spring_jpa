package com.example.Day2.model;

public class LocationModel {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "location_city='" + city + '\'' +
                ", location_country='" + country + '\'' +
                '}';
    }
}
