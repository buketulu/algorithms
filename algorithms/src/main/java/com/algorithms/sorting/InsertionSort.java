package com.algorithms.sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr) { 
		int n=arr.length;
		for (int i=1;i<n;i++) {
			int key=arr[i];
			//insert key into the sorted part of the array
			for(int j=i-1;j>=0;j--) {
				if (arr[j]>key) {
					arr[j+1]= arr[j];
					arr[j]=key;
				}
			}
		}
		return;
	}
}
