package org.example.abstract_class_and_interface.homework_5;

//5.Write a program suppose, it is required to build a project
//        consisting of a number of classes, possibly using a large
//        number of programmers. It is necessary to make sure that
//        every class from which all other classes in the project will be
//        inherited. Since any new classes in the project must inherit
//        from the base class, programmers are not free to create a
//        different interface. Therefore, it can be guaranteed that all
//        the classes in the project will respond to the same debugging commands

public class Base {

    public void enable() {
        if (b) {
            System.out.println("Hello from Parent class");
        }else System.out.println("Happy New Year");
    }
    static  boolean b = true;
    public void disable() {
        Base.b = !b;
    }
}
