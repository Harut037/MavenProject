package org.example.inheritance.composition.example_2;

public class Car {

    private Fuel fuel;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }
}
