package com.algorithms.sorting;

public class SelectionSort {

		public static void selectionSort(int[] arr) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				int minIndex=i;
				for(int j=i+1;j<n;j++) {
					if (arr[minIndex]>arr[j]) {
						minIndex=j;
					}
				}
				//swap arr[i] and min value of unsorted part
				int tmp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=tmp;
			}
			return;
		}
}
