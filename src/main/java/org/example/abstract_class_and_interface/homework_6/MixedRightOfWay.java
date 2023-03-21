package org.example.abstract_class_and_interface.homework_6;

public class MixedRightOfWay implements RightOfWay{
    @Override
    public void move() {
        System.out.println("Moving on a mixed(hybrid) right of way");
    }
}
