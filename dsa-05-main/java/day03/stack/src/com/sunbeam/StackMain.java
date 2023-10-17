package com.sunbeam;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public void push(int val) {
		top++;
		arr[top] = val;
	}
	
	public int pop() {
		int val = arr[top];
		top--;
		return val;
	}
	
	public int peek() {
		int val = arr[top];
		return val;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
}

public class StackMain {
	public static void main(String[] args) {
		int choice, val;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(6);
		do {
			System.out.print("\n\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. IsEmpty\n5. IsFull\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: // push
				if(!s.isFull()) {
					System.out.print("Enter value to Push: ");
					val = sc.nextInt();
					s.push(val);
				} else {
					System.out.println("Stack is Full.");
				}
				break;
			case 2: // pop
				if(!s.isEmpty()) {
					val = s.pop();
					System.out.println("Value Popped: " + val);
				} else {
					System.out.println("Stack is Empty.");
				}
				break;
			case 3: // peek
				if(!s.isEmpty()) {
					val = s.peek();
					System.out.println("Value Peeked: " + val);
				} else {
					System.out.println("Queue is Empty.");
				}
				break;
			case 4: // isEmpty
				System.out.println("Queue Empty: " + s.isEmpty());
				break;
			case 5: // isFull
				System.out.println("Queue Full: " + s.isFull());
				break;
			}
		}while(choice != 0);
	}
}
