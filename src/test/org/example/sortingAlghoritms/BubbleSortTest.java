package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bs = new BubbleSort();
    InsertionSort is = new InsertionSort();
    SelectionSort ss = new SelectionSort();

    @Test
    void bubbleSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(is.insertionSort(arr), ss.selectionSort(arr));
    }
}