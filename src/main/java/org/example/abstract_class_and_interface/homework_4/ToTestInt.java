package org.example.abstract_class_and_interface.homework_4;

public class ToTestInt extends Arithmetic{
    public static void main(String[] args) {
//     4. Write a program to create interface named test. In this
//        interface the member function is square. Implement this
//        interface in arithmetic class. Create one new class called
//        ToTestInt in this class use the object of arithmetic class.
        Test test = new Arithmetic();
        Arithmetic ar = new Arithmetic();
        ar.square();
        test.square();
    }
}
