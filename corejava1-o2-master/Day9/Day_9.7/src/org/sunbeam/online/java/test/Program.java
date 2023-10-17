package org.sunbeam.online.java.test;
public class Program {
	static int number = 0;	// OK
	public static void print( ) {
		//static int number = 0;	//Not OK
		++ number;
		System.out.println("Number	:	"+number);
	}
	public static void main(String[] args) {
		Program.print();	//1
		Program.print();	//2
		Program.print();	//3
	}
}
