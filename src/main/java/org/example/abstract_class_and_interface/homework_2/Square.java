package org.example.abstract_class_and_interface.homework_2;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Square has drawn");
    }

    @Override
    public void erase() {
        System.out.println("Square has erased");
    }
}
