package org.example.abstract_class_and_interface.homework_2;

public class Main {

//    2.Write a program to create a class named Shape which has two abstract
//    methods: draw() and erase(). In this class we have three sub classes Circle, Triangle and Square. Each of them has
//    override version of methods. Create these using polymorphism concepts


    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.erase();
        Square sq = new Square();
        sq.draw();
        sq.erase();
        Triangle tr = new Triangle();
        tr.draw();
        tr.erase();
    }
}
