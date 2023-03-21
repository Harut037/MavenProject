package org.example.abstract_class_and_interface.homework_6;

public class Bus extends Vehicle {
    public Bus(String number, String type) {
        super(number, type);
    }

    @Override
    void operate() {
        System.out.println("Operating the bus");
    }
}
