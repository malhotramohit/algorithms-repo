package com.rms.sorting;

import java.util.Random;

public class QuickSort {

	private static int partition(int[] array, int p, int q) {
		// Lets take first element as Pivot
		// i.e. array[0];
		// Defining two index counters to track the elements to swap with
		int i = p;
		// Start comparing pivot value with the value at index j (=1 initially),
		// if value at index j is less than pivot then increment i and swap the value at
		// i with the value at j
		// else just increment j (i.e. a loop is required)
		for (int j = 1; j < q; j++) {
			if (array[0] > array[j]) {
				i++;
				swap(array, i, j);
			} // else just increment j in loop its already doing j++
		}
		swap(array, 0, i);
		// To get the pivot at the sorted place i.e.
		// on left of it all are less than pivot and in right all are greater than pivot
		// i.e. 5,3,(12),34,38,76,100
		return i;

	}

	private static void quickSort(int[] array, int p, int q) {
		if (q - p >= 1) {
			int m = QuickSort.partition(array, p, q); // Getting index to divide , partial divide and conquer, here 'm'
			// int[] leftArray=Arrays.copyOfRange(array, p, m);
			// int[] rightArray=Arrays.copyOfRange(array, m+1, q+1);
			
				quickSort(array, p, m ); // sorting left sub array
				quickSort(array, m +1, q); // sorting right sub array
		}
	}

	private static void swap(int[] array, int i, int j) {
		int a = array[i]; // 12
		int b = array[j]; // 3
		a = a + b; // 15
		b = a - b; // 15-3=12
		a = a - b; // 15-12=3
		array[i] = a;
		array[j] = b;

	}

	public static void main(String[] args) {
		// Sample input
		int[] inputArray = { 12, 3, 76, 34, 38, 5, 100 };
		// Sample input 2
		Random random = new Random();
		int[] inputArray2 = new int[10];
		for (int i = 0; i < inputArray2.length; i++) {
			int num = random.nextInt(100);
			System.out.println(num);
			inputArray2[i] = num;
		}
		System.out.println("Befor--");
		// start index p=0 and end index q=length-1
		QuickSort.quickSort(inputArray2, 0, inputArray2.length - 1);
		System.out.println("After--");
		for (int i = 0; i < inputArray2.length; i++) {
			System.out.println(inputArray2[i]);
		}
	}

}
