package binarysearch;

import java.util.Scanner;

public class BinarySearchMain {

	public static int binarySearch(int left, int right, int[] arr, int key) {
		if(left > right)
			return -1;
		int index, mid = (left + right) / 2;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			index = binarySearch(left, mid-1, arr, key);
		else // if(key > arr[mid])
			index = binarySearch(mid+1, right, arr, key);
		return index;
	}
	
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		int key = sc.nextInt();
		int index = binarySearch(0, arr.length-1, arr, key);
		if(index == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at index: " + index);
	}

}
