package org.example.abstract_class_and_interface.homework_1;

public class Main {

//    1.Create an abstract class 'Parent' with an abstract method
//    message(). It has two subclasses ChildOne & ChildSecond
//    each having override version of  message() method that
//    prints "This is first subclass" and "This is second subclass"
//    respectively. Call the message()  by creating an object for
//    each subclass

    public static void main(String[] args) {
        ChildOne one = new ChildOne();
        ChildTwo two = new ChildTwo();
        one.message();
        two.message();

    }
}
