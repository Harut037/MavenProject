package org.example.abstract_class_and_interface.homework_2;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle has drawn");
    }

    @Override
    public void erase() {
        System.out.println("Triangle has erased");
    }
}
