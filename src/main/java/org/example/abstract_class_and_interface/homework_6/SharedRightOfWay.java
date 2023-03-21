package org.example.abstract_class_and_interface.homework_6;

public class SharedRightOfWay implements RightOfWay{
    @Override
    public void move() {
        System.out.println("Moving on a shared right of way");
    }
}
