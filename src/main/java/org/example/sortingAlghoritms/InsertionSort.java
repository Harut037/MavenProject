package org.example.sortingAlghoritms;

public class InsertionSort {


    /**
     * This method sorting our array with insertion sort`s algorithm.
     * @param array
     * @return
     */
    public int[] insertionSort(int[] array){ // 198, 56, 98, 34, 0, -34, 11, -23

        System.out.print("\n\nUnsorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  "  ");
        }
        System.out.println("]");
        int tmp;
int j;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > tmp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
        }
        System.out.print("\nSorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  "  ");
        }
        System.out.println("]");
        return array;
    }
}
