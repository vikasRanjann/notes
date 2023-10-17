package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Program {
	public static void main(String[] args) {
		Deque<Integer> stk = new ArrayDeque<Integer>( );
		stk.push(10);
		stk.push(20);
		stk.push(30);
		Integer element = null;
		while( !stk.isEmpty()){
			element  = stk.peek();
			System.out.println(element+" is removed");
			stk.pop();
		}
	}
	public static void main1(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		Integer element = null;
		while( !stk.empty()) {
			element = stk.peek();
			System.out.println(element+" is removed");
			stk.pop();
		}
	}
}
