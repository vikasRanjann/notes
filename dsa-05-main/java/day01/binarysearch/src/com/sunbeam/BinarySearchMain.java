package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {
	// O(log n)
	public static int binarySearch(int a[], int key) {
		int left = 0, right = a.length - 1, mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if(key == a[mid])
				return mid;
			if(key < a[mid])
				right = mid - 1;
			else /* (key > a[mid]) */
				left = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		if(index == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element is found at index: " + index);
	}

}
