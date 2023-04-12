package org.example.collections.generics;


import java.util.List;
import java.util.Scanner;

public class Generics<T> extends Palindromes{



    /**
     * Method swaps two no equals element in the array.
     * @param array
     * @param index1
     * @param index2
     * @param <T>
     */
     public <T> void swap(T[] array, int index1, int index2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]\n");

        if (!array[index1].equals(array[index2])) {
            T tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
            System.out.print("Array after swap` [ ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "  ");
            }
            System.out.println("]");
        } else {
            System.out.println("Array`s elements are equals, please enter other indexes:");
            System.out.println("Enter index1 and index2: ");
            swap(array, sc.nextInt(), sc.nextInt());
        }
    }

    /**
     * Method find maximum element in the range.
     * @param list
     * @param begin
     * @param end
     * @return
     * @param <T>
     */
    public  <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin >= end) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

}
