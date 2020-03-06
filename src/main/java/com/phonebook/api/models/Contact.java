package com.phonebook.api.models;

public class Contact {

    private final String name;
    private final String phoneNumber;
    private final String email;
    private final Address address;

    public Contact(String name, String phoneNumber, String email, Address address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public Address getAddress(){
        return   address;
    }

}
