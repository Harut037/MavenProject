package org.example.operators;

public class JavaOperators {
    public static void main(String[] args) {
        JavaOperators jo = new JavaOperators();
        // jo.arithmeticOperators(8,6);
        // jo.arithmeticOperators(6.4,0.03);
        // jo.print();
        // jo.unaryOperators(10,-88,true);
        // jo.assignmentOperator();
        // jo.relationOperators(10,20);
        // jo.additionalTask();
        // jo.shiftOperator(2);
    }

    // Arithmetic Operators

    /**
     * Print arithmetic operations
     * @param a
     * @param b
     */
    public void arithmeticOperators(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));
        System.out.println("--------------------------------");
    }

    /**
     * Print arithmetic operations
     * @param c
     * @param d
     */
    public void arithmeticOperators(double c, double d) {
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));
        System.out.println("--------------------------------");
    }

    /**
     * Print arithmetic operations
     */

    public void print() {
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("------------------------------");
    }

    // Unary Operators

    /**
     * Print unary operations
     * @param e
     * @param f
     * @param n1
     */
    public void unaryOperators(int e, int f, boolean n1) {
        System.out.println("-e = " + (-e));
        System.out.println("-f = " + (-f));
        System.out.println("+e = " + (+e));
        System.out.println("-e + 92 = " + (-e + 92));
        System.out.println("!n1 = " + (!n1));
        System.out.println("!(!n1) = " + (!(!n1)));
        System.out.println("e++ = " + (e++));
        System.out.println("--f = " + (--f));
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("--------------------------------");
    }

    // Assignment Operator

    /**
     * Print assignment operations
     */
    public void assignmentOperator() {
        int x = (int) 1.0;
        short y = (short) 1921222;
        System.out.println(2147483647 + 1);
        long l = (x = 3);
        boolean b = false;
        boolean f = (b = true);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("l = " + l);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("--------------------------------------");
    }

    // Relation Operators

    /**
     * Print relation operations
     * @param x
     * @param y
     */
    public void relationOperators(int x, int y) {
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
        System.out.println("-------------------------------------");
    }

    // Additional task

    /**
     * Correct errors
     */
    public void additionalTask() {
        float f = 2.1f;
        byte x = 5, y = 10;
        int z = x + y;
        short x2 = 10, y2 = 3;
        int multiply = x2 * y2;
        long l = 10L;
        int i = 5;
        i *= l;

        int n = 10, m = 5;
        n = n >> 1;
        m = m << 1;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        int sum = (1 + 100) * 100 / 2;
        System.out.println("sum = " + sum);
        System.out.println("-------------------------------------------");

    }

    // Shift Operator

    /**
     * Method include exercises with shift operators
     * @param x
     */
    public void shiftOperator(int x) {
        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 2 = " + (-10 << 2));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3));
        x = x << 3;
        System.out.println("x * 8 = " + x);
        x = x << 1;
        System.out.println("x * 16 = " + x);
    }

}
