package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 *
 *Bubble sort with dynamic input
 */
public class BubbleSortDynamicArrayInput {

	int[] arr;
	
	public void sort_logic() {
		boolean swapped;
        int n = arr.length;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            
            print();
            n--; // Reduce the range of the inner loop
        } while (swapped);
	}
	
	public void sort() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
        	arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array:" + Arrays.toString(this.arr));
        sort_logic();
        scanner.close();
	}
	
	public void print() {
		System.out.println("Sorted array --> " + Arrays.toString(this.arr));
	}
}
