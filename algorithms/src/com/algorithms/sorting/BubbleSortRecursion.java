package com.algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble sort by recursion
 *
 */
public class BubbleSortRecursion {

	int[] arr = {8, 6, 3, 9, 10};
	
	public void recursiveSort(int[] arr, int n) {
		System.out.println("Iterations --> " + n);
		if(n == 1) {
			System.out.println("No sorting as  size 1 --> " + Arrays.toString(this.arr));
			return;
		}
		
		boolean isSwapped = false;
		
		for(int i=0; i < arr.length - 1; i++) {
			
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				isSwapped = true;
			}
		}
		
		if(!isSwapped) {
			System.out.println("Already Sorted array --> " + Arrays.toString(this.arr));
			return;
		}
		
		System.out.println("Sorted array --> " + Arrays.toString(this.arr));
		recursiveSort(this.arr, n -1);
	}
	
	public void sort() {
		this.recursiveSort(this.arr, arr.length);
	}
}
