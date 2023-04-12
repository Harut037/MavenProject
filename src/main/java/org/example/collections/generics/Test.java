package org.example.collections.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Generics generics = new Generics();
        Palindromes palindromes = new Palindromes();

        Scanner scanner = new Scanner(System.in);


//    1. Write a generic method to exchange the positions of two different elements in an array.

//        System.out.println("Enter index1 and index2: ");
//        generics.swap(new Object[]{1, 11, -89, 0, 6, 11, 5}, scanner.nextInt(), scanner.nextInt());


//    2. Will the following class compile? If not, why?
//
//      public final class Algorithm {
//      public static <T> T max(T x, T y) {
//        return x > y ? x : y;
//        }
//    }

//        System.out.println("Operator '>' cannot be applied to 'T', 'T'");


//    3. Will the following method compile? If not, why?
//
//    public static void print(List<? extends Number> list) {
//    for (Number n : list)
//    System.out.print(n + " ");
//    System.out.println();
//    }

//        System.out.println("The code compile without issue");


//    4. Write a generic method to find the maximal element in the range [begin, end) of a list.

//        System.out.println(generics.findMax(new ArrayList<>(List.of(19, 0, 5, -11, 45)),0,5));


//    5. Create a generic type to represent a pair of objects. The two objects in the pair can
//       be of different types.

//        Pair<String,Integer> pair = new Pair<>("Harut",20);
//        String[] strings = new String[]{"aba, bab, aca, akk"};


//    7. Write a generic method to count the number of elements in a collection that have a
//       specific property (e.g., odd integers, prime numbers, palindromes).


        System.out.println("\nPalindromes element in the list --> " + generics.palindrome());
        System.out.println("\nPrime numbers in the list --> " + generics.checkPrimesNumber(new ArrayList<>(List.of(17, 29, 101, 15, 22))));
        System.out.println("\nOdd numbers int the list --> " + generics.checkNumber(new ArrayList<>(List.of(17, 29, 101, 15, 22, 34, 11,95))));
    }
}
