package org.example.abstract_class_and_interface.homework_4;

public class Arithmetic implements Test{
    int n = 5;

    /**
     * This method print square of the given number.
     */
    @Override
    public void square() {
        System.out.println(n*n);
    }
}
