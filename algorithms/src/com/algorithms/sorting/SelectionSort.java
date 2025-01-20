package com.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	int[] arr = new int[] {64, 34, 25, 12, 22, 11, 90};

	public void sort() {
		System.out.println("Initial  array --> " + Arrays.toString(arr));
		if(this.arr.length == 1) {
			return;
		}

		for(int i=0; i< this.arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i+1; j < this.arr.length; j++) {
				if(this.arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}

			//swap
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		System.out.println("Sorted array --> " + Arrays.toString(arr));
	}

}
