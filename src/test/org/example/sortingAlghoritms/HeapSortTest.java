package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    HeapSort hs = new HeapSort();
    MergeSort ms = new MergeSort();

    @Test
    void heapSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(hs.heapSort(arr), ms.mergeSort(arr1));
    }
}