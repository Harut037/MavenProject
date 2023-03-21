package org.example.exceptions;

public class Divider {

    public int a = 10, quantity;


    /**
     * This method count quantity with two elements;
     * @param b
     */
    public void quantity(int b){
        try{
            quantity = a / b;
            System.out.print("\nQuantity = " + quantity);
        }catch (ArithmeticException e){

           System.out.println("\nError, you can`t number divide by 0");
        }

    }
}
