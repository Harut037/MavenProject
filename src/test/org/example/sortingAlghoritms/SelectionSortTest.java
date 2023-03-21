package org.example.sortingAlghoritms;

import org.example.abstract_class_and_interface.homework_7.B;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    BubbleSort bs = new BubbleSort();
    SelectionSort ss = new SelectionSort();

    @Test
    void selectionSort() {
        int[] arr = {198, 56, 98, 34, 0, -34, 11, -23};
        int[] arr1 = {198, 56, 98, 34, 0, -34, 11, -23};
        assertArrayEquals(ss.selectionSort(arr), bs.bubbleSort(arr1));
    }
}