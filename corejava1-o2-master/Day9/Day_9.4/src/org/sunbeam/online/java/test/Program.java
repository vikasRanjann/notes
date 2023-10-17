package org.sunbeam.online.java.test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] number ) {
		System.out.print("Enter number	:	");
		number[ 0 ] = sc.nextInt();
	}
	public static void printRecord( int[] number ) {
		System.out.println("Number	:	"+number[ 0 ]);
	}
	public static void main(String[] args) {
		int[] number = new int[1];
		Program.acceptRecord( number );
		Program.printRecord( number );
	}
}
