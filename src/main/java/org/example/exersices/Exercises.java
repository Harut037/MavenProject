package org.example.exersices;

import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercises ex = new Exercises();

//        System.out.print("Enter x, y and z =  ");
//        ex.rice(sc.nextInt(), sc.nextInt(), sc.nextInt());

//        System.out.print("Enter number =  ");
//        ex.largestPrimeDivider(sc.nextInt());

//        ex.evenOrOddNumber(10);

//        System.out.print("Enter number  of floors = ");
//        Scanner sc = new Scanner(System.in);
//        ex.search(sc.nextInt());


    }






    Random rand = new Random();
    int[] array = new int[10];

    /**
     * This method find even and odd numbers and printed.
     * @param n
     */
    public void evenOrOddNumber(int n) {
        int tmp = 0;
        int min = 0;
        boolean b = true;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + "  is even number");
            } else System.out.println(array[i] + "  is odd number");
        }
        System.out.println("---------------------------------");
    }


    /**
     * This method find the largest prime divider.
     * @param n
     * @return
     */
    public int largestPrimeDivider(int n) {
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.println("                " + i);
            }
        }
        if (n != 1) {
            System.out.println("                " + n + "  is the largest divider");
        }
        return n;
    }

    /**
     * This method decided, will we can solve this exercises with our parameters
     * @param x
     * @param y
     * @param z
     * @return
     */
    public boolean rice(int x, int y, int z) {
        boolean b = false;
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
        if (x * 5 + y < z) {
            System.out.println("Please enter again");
        } else {
            int[] ar = new int[x];
            int[] arr = new int[y];
            int k = 0;
            for (int i = 0; i < x; i++) {
                ar[i] = k++;
            }
            int f = 0;
            for (int i = 0; i < y; i++) {

                arr[i] = f++;
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (ar[i] * 5 + arr[j] == z) {
                        b = true;
                        break;
                    }
                    break;
                }
            }
        }
        if (b == true) {
            System.out.println("true");
        } else System.out.println("false");
        return b;
    }

}






