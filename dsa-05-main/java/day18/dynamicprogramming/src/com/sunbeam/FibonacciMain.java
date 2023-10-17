package com.sunbeam;

public class FibonacciMain {
	public static long count;
	
	public static long recFib(int n) {
		count++;
		if(n == 1 || n == 2)
			return 1;
		long term = recFib(n-1) + recFib(n-2);
		return term;
	}
	
	public static long memFib(int n, long[] terms) {
		count++;
		if(terms[n] != 0L)
			return terms[n];
		if(n == 1 || n == 2) {
			terms[n] = 1;
			return terms[n];
		}
		terms[n] = memFib(n-1, terms) + memFib(n-2, terms);
		return terms[n];
	}
	
	public static long memFib(int n) {
		long[] terms = new long[n+1];
		return memFib(n, terms);
	}
	
	public static long dpFib(int n) {
		count++;
		long[] terms = new long[n+1];
		terms[1] = terms[2] = 1; // initial state
		for(int i=3; i<=n; i++)
			terms[i] = terms[i-1] + terms[i-2];
		return terms[n];
	}
	
	public static void main(String[] args) {
		int n = 40;
		long result;
		
		count = 0;
		result = recFib(n);
		System.out.println(n + "th term = " + result + " with function calls : " + count);

		count = 0;
		result = memFib(n);
		System.out.println(n + "th term = " + result + " with function calls : " + count);
		
		count = 0;
		result = dpFib(n);
		System.out.println(n + "th term = " + result + " with function calls : " + count);
	}

}
