package org.example.sortingAlghoritms;

public class MergeSort {

    /**
     * This method sorted our array with merge sort`s algorithm.
     * @param array
     */
    public int[] mergeSort(int[] array) {
        System.out.print("\n\nUnsorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");
        mergingSort(array);
        System.out.print("\n\nSorted array` [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");
        return array;
    }

    /**
     * This method divides our array into smaller arrays, while that arrays`s length larger than one.
     * @param array
     */
    public void mergingSort(int[] array) {

        int n = array.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        mergingSort(l);
        mergingSort(r);
        merge(array, l, r);
    }


    /**
     * This method sorted our small arrays and consolidates them into a single array․
     * @param array
     * @param l
     * @param r
     */
    public void merge(int[] array, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                array[index] = l[i];
                i++;
                index++;
            } else {
                array[index] = r[j];
                j++;
                index++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            array[index++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            array[index++] = r[rr];
        }
    }
}
