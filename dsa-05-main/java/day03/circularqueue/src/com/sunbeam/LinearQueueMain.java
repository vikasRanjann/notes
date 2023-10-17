package com.sunbeam;

import java.util.Scanner;

class LinearQueue {
	private int[] arr;
	private int front, rear;

	public LinearQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public void push(int val) {
		rear = rear + 1;
		arr[rear] = val;
	}
	
	public int pop() {
		front = front + 1;
		int val = arr[front];
		return val;
	}
	
	public int peek() {
		int val = arr[front + 1];
		return val;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == (arr.length-1);
	}
}

public class LinearQueueMain {
	public static void main(String[] args) {
		/***
		LinearQueue q = new LinearQueue(6);
		q.push(11);
		q.push(22);
		q.push(33);
		q.push(44);
		while(!q.isEmpty()) {
			int val = q.pop();
			System.out.println("Popped: " + val);
		}
		***/
		int choice, val;
		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(6);
		do {
			System.out.print("\n\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. IsEmpty\n5. IsFull\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: // push
				if(!q.isFull()) {
					System.out.print("Enter value to Push: ");
					val = sc.nextInt();
					q.push(val);
				} else {
					System.out.println("Queue is Full.");
				}
				break;
			case 2: // pop
				if(!q.isEmpty()) {
					val = q.pop();
					System.out.println("Value Popped: " + val);
				} else {
					System.out.println("Queue is Empty.");
				}
				break;
			case 3: // peek
				if(!q.isEmpty()) {
					val = q.peek();
					System.out.println("Value Peeked: " + val);
				} else {
					System.out.println("Queue is Empty.");
				}
				break;
			case 4: // isEmpty
				System.out.println("Queue Empty: " + q.isEmpty());
				break;
			case 5: // isFull
				System.out.println("Queue Full: " + q.isFull());
				break;
			}
		}while(choice != 0);
	}
}
