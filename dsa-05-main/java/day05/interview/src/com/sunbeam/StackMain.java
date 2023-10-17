package com.sunbeam;

import java.util.Arrays;
import java.util.Stack;

public class StackMain {
	// time complexity: O(n), aux space: O(1)
	public static void reverseArray(int[] arr) {
		for(int i=0, j=arr.length-1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	// time complexity: O(n), aux space: O(n)
	public static void reverseArrayUsingStack(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int i;
		for(i=0; i<arr.length; i++)
			s.push(arr[i]);
		i = 0;
		while(!s.isEmpty()) {
			arr[i] = s.pop();
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		/*
		int[] arr = { 11, 22, 33, 44, 55 };
		System.out.println("Array: " + Arrays.toString(arr));
		reverseArray(arr);
		//reverseArrayUsingStack(arr);
		System.out.println("Array: " + Arrays.toString(arr));
		*/
		/*
		StackUsingQueue s = new StackUsingQueue();
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		while(!s.isEmpty()) {
			System.out.println("Popped: " + s.pop());
		}
		*/
	}
}
