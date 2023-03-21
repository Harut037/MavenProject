package org.example.sortingAlghoritms;

public class SelectionSort {


    /**
     * This method sorting our array with selection sort`s algorithm.
     * @param array
     * @return
     */
    public int[] selectionSort(int[] array){

        System.out.print("\n\nUnsorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");

        int tmp;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        System.out.print("\n Sorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");
        return array;
    }
}
