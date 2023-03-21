package org.example.abstract_class_and_interface.homework_6;


//     6. Write a program to model MBTA vehicles
//        • Three types of vehicles: Bus, Urban Rail,and Commuter rail
//        • Three kinds of Right-of-Way: Dedicated,Shared, and Mixed
//        (Hybrid)
public abstract class Vehicle {

    private String number;
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }

    abstract void operate();
}
