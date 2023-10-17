package com.sunbeam;

import java.util.Arrays;

/*
public static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}
*/
public class SortingMain {
	public static void printArray(int a[]) {
		//System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");
		System.out.println();
	}
	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void bubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void improvedBubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void furtherImprovedBubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			boolean swap = false;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false)
				break;
		}
	}
	public static void insertionSort(int[] a) {
		int i, j;
		for(i=1; i<a.length; i++) {
			int temp = a[i];
			for(j=i-1; j>=0 && a[j]>temp; j--)
				a[j+1] = a[j];
			a[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {5, 6, 3, 8, 2, 4};
		printArray(arr);
//		selectionSort(arr);
//		bubbleSort(arr);
//		improvedBubbleSort(arr);
//		furtherImprovedBubbleSort(arr);
		insertionSort(arr);
		printArray(arr);
	}

}
