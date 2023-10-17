package com.sunbeam;

import java.util.Stack;

public class ExpressionMain {
	
	public static int pri(char operator) {
		switch (operator) {
			case '+':	return 1;
			case '-':	return 1;
			case '*':	return 4;
			case '/':	return 4;
			case '%':	return 4;
			case '$':	return 9;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		String postfix = "";
		Stack<Character> s = new Stack<>();
		// 1. traverse infix expr from left to right.
		for(int i=0; i<infix.length(); i++) {
			char sym = infix.charAt(i);
			// 2. if operand, append to postfix.
			if(Character.isDigit(sym))
				postfix = postfix + sym;
			else if(sym == '(') 
				s.push(sym); // 6. if '(', push on the stack.
			else if(sym == ')') {
				// 7. if ')', then pop all operators from stack one by one and append to postfix until '(' is found. 
				while(s.peek() != '(')
					postfix = postfix + s.pop();
				s.pop(); // Also discard '('
			} else { // operator
				// 4. if priority of topmost operator in stack is greater or equal, pop it from stack and append to postfix.
				while(!s.isEmpty() && pri(s.peek()) >= pri(sym))
					postfix = postfix + s.pop();
				// 3. if operator, push to stack.
				s.push(sym);
			}
		}
		// 5. when infix is completed, pop all operators from stack one by one and append to postfix.
		while(!s.isEmpty())
			postfix = postfix + s.pop();
		return postfix;
	}

	public static String infixToPrefix(String infix) {
		String prefix = "";
		Stack<Character> s = new Stack<>();
		// 1. traverse infix expr from right to left.
		for(int i=infix.length()-1; i>=0; i--) {
			char sym = infix.charAt(i);
			// 2. if operand, append to prefix.
			if(Character.isDigit(sym))
				prefix = prefix + sym;
			else if(sym == ')') 
				s.push(sym); // 6. if ')', push on the stack.
			else if(sym == '(') {
				// 7. if '(', then pop all operators from stack one by one and append to prefix until ')' is found. 
				while(s.peek() != ')')
					prefix = prefix + s.pop();
				s.pop(); // Also discard ')'
			} else { // operator
				// 4. if priority of topmost operator in stack is greater than current operator, pop it from stack and append to prefix.
				while(!s.isEmpty() && pri(s.peek()) > pri(sym))
					prefix = prefix + s.pop();
				// 3. if operator, push to stack.
				s.push(sym);
			}
		}
		// 5. when infix is completed, pop all operators from stack one by one and append to prefix.
		while(!s.isEmpty())
			prefix = prefix + s.pop();
		// 8. reverse the prefix
		prefix = new StringBuilder(prefix).reverse().toString();
		return prefix;
	}
	
	public static int calc(int a, int b, char op) {
		switch (op) {
			case '+':	return a + b;
			case '-':	return a - b;
			case '*':	return a * b;
			case '/':	return a / b;
			case '%':	return a % b;
			case '$':	return (int)Math.pow(a, b);
		}
		return 0;
	}
	
	public static int solvePostfix(String postfix) {
		int result = 0;
		Stack<Integer> s = new Stack<>();
		// 1. traverse postfix from left to right
		for(int i=0; i<postfix.length(); i++) {
			char sym = postfix.charAt(i);
			// 2. if operand, push on stack (after converting char to int)
			if(Character.isDigit(sym))
				s.push(sym - 48);
			// 3. if operator, pop two operands, calculate result and push to stack
			else {
				int b = s.pop();
				int a = s.pop();
				result = calc(a, b, sym);
				s.push(result);
			}
		} // 4. repeat process until end of postfix
		// 5. pop the final result from the stack
		result = s.pop();
		return result;
	}
	
	// homework: do paperwork
	public static int solvePrefix(String prefix) {
		int result = 0;
		Stack<Integer> s = new Stack<>();
		// 1. traverse prefix from right to left
		for(int i=prefix.length()-1; i>=0; i--) {
			char sym = prefix.charAt(i);
			// 2. if operand, push on stack (after converting char to int)
			if(Character.isDigit(sym))
				s.push(sym - 48);
			// 3. if operator, pop two operands, calculate result and push to stack
			else {
				int a = s.pop();
				int b = s.pop();
				result = calc(a, b, sym);
				s.push(result);
			}
		} // 4. repeat process until end of prefix
		// 5. pop the final result from the stack
		result = s.pop();
		return result;
	}

	public static boolean checkParenthisis(String expr) {
		String open = "([{", close = ")]}";
		Stack<Character> s = new Stack<>();
		for(int i=0; i<expr.length(); i++) {
			char sym = expr.charAt(i);
			int index = open.indexOf(sym);
			if(index != -1)	// if sym is opening parenthesis
				s.push(sym);
			else {
				index = close.indexOf(sym);
				if(index != -1) {	// if sym is closing parenthesis
					if(s.isEmpty())
						return false;	// extra closing
					char opening = s.pop();
					int openIndex = open.indexOf(opening);
					if(index != openIndex)
						return false;	// mismatch
				}
			}
		}
		if(!s.isEmpty())			// missing closings
			return false;
		return true;				// balanced
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = "", prefix = "";
		int result;
		postfix = infixToPostfix(infix);
		prefix = infixToPrefix(infix);
		System.out.println("Infix: " + infix);
		System.out.println("Postfix: " + postfix);
		result = solvePostfix(postfix);
		System.out.println("Postfix Result: " + result);
		System.out.println("Prefix: " + prefix);
		result = solvePrefix(prefix);
		System.out.println("Presfix Result: " + result);
		System.out.println("Parenthesis Balanced: " + checkParenthisis(infix));
	}

}
