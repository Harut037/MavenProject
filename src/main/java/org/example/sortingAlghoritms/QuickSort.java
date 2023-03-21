package org.example.sortingAlghoritms;

public class QuickSort {



    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            // Choose a pivot element and partition the array
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the subarrays
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private  int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;  // Initialize the index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high], which puts the pivot element in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public int[] quickSort(int[] arr){
        System.out.print("\n\nUnsorted array` [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");;
        }
        System.out.print("]");
        System.out.print("\n\nSorted array` [ ");
        sort(arr, 0, arr.length  - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("]\n");
        return arr;
    }
}

