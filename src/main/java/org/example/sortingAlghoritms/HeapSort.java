package org.example.sortingAlghoritms;

import java.util.Arrays;

public class HeapSort {

    public void heapSorting(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n-1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted with node i which is an index in arr[]
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2*i + 1; // left = 2*i + 1
        int right = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public int[] heapSort(int[] arr){
        System.out.print("\n\nUnsorted array` [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");;
        }
        System.out.print("]");
        System.out.print("\n\nSorted array` [ ");
        heapSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("]\n");
        return arr;
    }

    // Driver code to test above

}

