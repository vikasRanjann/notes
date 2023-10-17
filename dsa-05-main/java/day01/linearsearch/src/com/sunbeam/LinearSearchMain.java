package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {
	// space complexity
		// input space = O(n)
		// aux space = O(1)
		// total = O(n) + O(1) = O(n)
	public static int linearSearch(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 11};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if(index == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element is found at index: " + index);
	}
}
