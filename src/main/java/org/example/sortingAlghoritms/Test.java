package org.example.sortingAlghoritms;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{198, 56, 98, 34, 0, -34, 11, -23};
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(array);

        SelectionSort selectionSort = new SelectionSort();
//       selectionSort.selectionSort(array);

        InsertionSort is = new InsertionSort();
       is.insertionSort(array);

        MergeSort ms = new MergeSort();

//        ms.mergeSort(array);

        QuickSort qs = new QuickSort();
//        qs.quickSort(array);

        HeapSort hs = new HeapSort();
//    hs.heapSort(array);

    }
}
