package com.phonebook.api.models;

import java.util.UUID;

public class Address {
    private final UUID id;
    private final String street;
    private final String city;
    private final String country;

    public Address(UUID id, String street, String city, String country){
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public UUID getId(){
        return id;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }
}
