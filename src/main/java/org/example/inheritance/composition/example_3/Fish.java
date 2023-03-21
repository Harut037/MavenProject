package org.example.inheritance.composition.example_3;

public class Fish {

    private Water water;

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Fish(Water water) {
        this.water = water;
    }
}
