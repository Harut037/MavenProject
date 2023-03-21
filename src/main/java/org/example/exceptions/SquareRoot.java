package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {

    Scanner sc = new Scanner(System.in);

    /**
     * This method found our number`s square root (if our number > zero and it is integer).
     */
    public void countSquareRoot(){
        int number;
        try {
            number = sc.nextInt();
            if (number <= 0 ){
                throw new InputMismatchException();
            }
            System.out.println("\nSquare root = " + Math.sqrt(number));
        }catch (InputMismatchException e){
            System.out.println("\nInvalid number ");
        }
        finally {
            System.out.println("\nGood bye");
        }
    }
}
