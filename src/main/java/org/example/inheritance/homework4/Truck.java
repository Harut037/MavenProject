package org.example.inheritance.homework4;

public class Truck extends Car {
    public static void main(String[] args) {

//        4. Create a class of Car class which has the following fields:
//        passengerCount //   it could not be less than 2
//                engineType // expected values  one letter (‘a-z , A-Z’)
//        methods: getter & setter of passengerCount & engineType fields
//        Create a subclass of Truck class. The Truck class has the following
//                fields:capacity  // default value should be 0
//        methods:  getter & setter of capacity field
//        Use super(...) method in the constructor for initializing the fields of the super class.

        Truck truck = new Truck(3,'1');
    }

    private int capacity;

    public Truck(int passengerCount, char engineType) {
        super(passengerCount, engineType);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
