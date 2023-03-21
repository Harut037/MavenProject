package org.example.exceptions;

public class Reciprocal {

    double reciprocal;


    /**
     * This method finding our number`s reciprocal (if number is not zero);
     * @param number
     */
    public void elementCheck(int number){

        try {
            if (number == 0){
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("\n Zero has not reciprocal number: ");
            System.exit(0);
        }
        reciprocal = 1.0/number;
        System.out.println("\nIn that number reciprocal is " + "1/" +number +" = " + reciprocal);
    }
}
