package com.algorithms.sorting;

import java.util.Arrays;

public class SelectionSortRecursion {
    int[] arr = new int[] {64, 34, 25, 12, 22, 11, 90};

    public void sort() {
        System.out.println("Initial  array --> " + Arrays.toString(arr));
        recursion(arr, 0);
    }

    public void recursion(int[] arr, int start) {
        if(this.arr.length == 1 || start >= arr.length) {
            return;
        }

        int minIndex = start;
        boolean isSwapNeeded = false;

        for (int j = start+1; j < this.arr.length; j++) {
            if(this.arr[j] < arr[minIndex]) {
                minIndex = j;
                isSwapNeeded = true;
            }
        }

        //swap
        if(isSwapNeeded) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = temp;
            System.out.println("Sorted array --> " + Arrays.toString(arr));
            recursion(arr, start + 1);
        }
    }
}
