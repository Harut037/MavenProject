package org.example.inheritance.homework4;

public class Car {
    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        }else System.out.println("Passengers are not be less than 2");
    }

    public char getEngineType() {
        return engineType;
    }

    public Car(int passengerCount, char engineType) {
        this.passengerCount = passengerCount;
        this.engineType = engineType;
    }

    public void setEngineType(char engineType) {
if (Character.isLetter(engineType)){
    this.engineType = engineType;
}  else System.out.println("Engine type include only one letter");


}
}
