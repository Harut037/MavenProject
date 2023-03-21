package org.example.inheritance.composition.example_3;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        Fish fish = new Fish(water);
        fish.getWater().aquariumIsNotEmpty();
    }
}
