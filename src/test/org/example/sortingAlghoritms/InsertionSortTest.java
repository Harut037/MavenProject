package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    QuickSort qs = new QuickSort();
    InsertionSort is = new InsertionSort();

    @Test
    void insertionSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(is.insertionSort(arr), qs.quickSort(arr1));
    }
}