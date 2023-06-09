package org.example.sortingAlghoritms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bs = new BubbleSort();
    InsertionSort is = new InsertionSort();


    @Test
    void bubbleSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(bs.bubbleSort(arr), is.insertionSort(arr1));
    }

}