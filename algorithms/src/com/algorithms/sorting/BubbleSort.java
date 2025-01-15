package com.algorithms.sorting;

import java.util.Arrays;

/**
 * 
 * Bubble sort - Sorts adjacent items at a time
 * bubbles max to the end in each iteration
 * 
 * BubbleSort myAlgo = new BubbleSort();
    	myAlgo.sort();
 */
public class BubbleSort {

	int[] arr = new int[] {64, 34, 25, 12, 22, 11, 90};
	boolean isSwapped;
	
	public void sort() {
		
		for(int i=0; i < arr.length - 1; i++) {
			System.out.println("Iteration: " + (i + 1));
			isSwapped = false;
			
			for(int j=0; j < arr.length - 1 - i; j++) {
				int temp;
				
				if(arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					isSwapped = true;
				}
			}
			
			if(!isSwapped) {
				break;
			}
			
			System.out.println("Sorted array --> " + Arrays.toString(this.arr));
		}	
		
	}

}
