package org.example.abstract_class_and_interface.homework_8;

public class Main {

//    8.An abstract class has a constructor which prints "This is
//    constructor of abstract class", an abstract method named
//    'a_method' and a non-abstract method which prints "This is a
//    normal method of abstract class". A class 'SubClass' inherits
//    the abstract class and has a method named 'a_method' which
//    prints "This is abstract method". Now create an object of
//    'SubClass' and call the abstract method and the non-abstract
//    method. (Analyse the result)

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.a_method();
        sc.non_abstract_method();
    }
}
