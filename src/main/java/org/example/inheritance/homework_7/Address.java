package org.example.inheritance.homework_7;

public class Address {

    private String country;
    private String street;
    private String numberOfHome;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberOfHome() {
        return numberOfHome;
    }

    public void setNumberOfHome(String numberOfHome) {
        this.numberOfHome = numberOfHome;
    }



    public Address(String country, String street, String numberOfHome) {
        this.country = country;
        this.street = street;
        this.numberOfHome = numberOfHome;
    }
}
