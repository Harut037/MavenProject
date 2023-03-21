package org.example.exceptions;

public class Quotient {


    /**
     * This method counted divided of two number.
     * @param number1
     * @param number2
     */
    public void quotientTwoNumbers(int number1, int number2){
        try {
            if (number2 <= 0){
                throw new ArithmeticException();
            }
           int quotient = number1/number2;
            System.out.print("\n\nThe quotient of " + number1 + " and " + number2 + " is " + quotient);
        } catch (ArithmeticException e){
            System.out.println("\nThe second integer must be positive and non-zero");
        }
    }
}
