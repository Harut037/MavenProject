package org.example.methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();
//        twoInputParams(sc.nextInt(), sc.nextInt());
//        hasNotInputParams();
//        helloWorld(sc.hasNext());
//        methods.thisInputParam('a');
//        returnOneOfThem(sc.nextFloat(), sc.nextFloat());
//        recursion();
    }


    // 1. Write a method which  .has two input parameters  type  int and return 0.

    /**
     * This method input two int parameters.
     * @param a
     * @param b
     * @return nothing.
     */
    public  static int twoInputParams(int a, int b) {

        return 0;
    }

    // 2. Write a method which has not input parameters and returns nothing.

    /**
     * This method doing nothing.
     */
    public static void hasNotInputParams() {

    }


    // 3. Write a method which .has a boolean input parameters  and print “Hello World”.

    /**
     * This method get one boolean parameters and print Hello World.
     * @param b
     */
    public static void helloWorld(boolean b) {
        System.out.println("Hello World");
    }


    // 4. Write a method which  .has a char input parameter  and return this  input parameter.

    /**
     * This method get one char parameters.
     * @param c
     * @return that char.
     */
    public char thisInputParam(char c) {
        return c;
    }

    // 5. Write a method which  .has  two float input parameters  and return  one of them.

    /**
     * This method get two float parameters.
     * @param a
     * @param b
     * @return one of them.
     */
    public static float returnOneOfThem(float a, float b) {
        return a;
    }

    // 6. Write a method which .has call itself inside body(recursion)

    /**
     * This method calls itself
     */
    public static void recursion() {
        recursion();
    }
}
