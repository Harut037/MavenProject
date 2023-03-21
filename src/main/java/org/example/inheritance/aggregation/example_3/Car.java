package org.example.inheritance.aggregation.example_3;

public class Car {

    private String mark;
    private int speed;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String mark, int speed) {
        this.mark = mark;
        this.speed = speed;
    }


}
