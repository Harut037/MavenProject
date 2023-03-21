package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

        QuickSort qs = new QuickSort();

        HeapSort hs = new HeapSort();
    @Test
    void quickSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(qs.quickSort(arr), hs.heapSort(arr1));
    }
}