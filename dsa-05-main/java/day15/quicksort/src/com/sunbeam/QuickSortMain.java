package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
	public static void quickSort(int arr[], int left, int right) {
		if(left >= right)
			return;
		int i = left, j = right;
		while(i < j) {
			while(i <= right && arr[i] <= arr[left])
				i++;
			while(arr[j] > arr[left])
				j--;
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 7, 9, 2, 8, 1, 6, 3, 5 };
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
