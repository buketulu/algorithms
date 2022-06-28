package com.algorithms.sorting;

public class Sort {

	public static void printSortedArr(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,2,2,2, 1, 1, 1, 1 };
		InsertionSort.insertionSort(arr);
		printSortedArr(arr);
		return;
		
	}

}
