package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    SelectionSort ss = new SelectionSort();
    MergeSort ms = new MergeSort();

    @Test
    void mergeSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(ms.mergeSort(arr), ss.selectionSort(arr1));

    }
}