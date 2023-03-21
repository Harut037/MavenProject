package org.example.abstract_class_and_interface.homework_2;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle has drawn");
    }

    @Override
    public void erase() {
        System.out.println("Circle has erased");
    }
}
