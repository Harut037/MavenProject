package org.example.sortingAlghoritms;

public class BubbleSort {


    /**
     * Method doing sort our array with bubble sort`s algorithm.
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array) {
        boolean check = true;
        int tmp;
        int checkLength = -1;
        System.out.print("\n\nUnsorted array`  [  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");


        while (check) {
            checkLength++;
            check = false;
            for (int i = 0; i < array.length - 1 - checkLength; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    check = true;
                }
            }
        }
        System.out.print("\nSorted array`  [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");
        return array;
    }


}
