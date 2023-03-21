package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayElements {
    Scanner sc = new Scanner(System.in);


    /**
     * This method adding elements in array and count that sum:
     * @param size
     * @return
     */
   public int[] addElements(int size){
        int sum = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = sc.nextInt();
                sum += array[i];
            } catch (InputMismatchException e){
                System.out.print("Error, you can`t add non - integer value: ");
                System.exit(0);
            }
        }
        System.out.print("Sum of array`s elements = " + sum);
        return array;
    }
}
