package org.sunbeam.online.java.test;

import java.util.Scanner;

import org.sunbeam.online.java.complex.Complex;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( Complex c ) {
		System.out.print("Real Number	:	");
		c.setReal( sc.nextInt() );
		System.out.print("Imag Number	:	");
		c.setImag(sc.nextInt());
	}
	public static void printRecord( Complex c ) {
		System.out.println("Real Number	:	"+c.getReal());
		System.out.println("Real Number	:	"+c.getImag());
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {	
		int choice;
		Complex c = new Complex();
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Program.acceptRecord(c);
				break;
			case 2:
				Program.printRecord(c);
				break;
			}
		}
	}
	public static void main2(String[] args) {
		
		Complex c = new Complex();
		
		Program.acceptRecord( c );
		
		Program.printRecord( c );
	}
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Complex c = new Complex();
		
		System.out.print("Real Number	:	");
		c.setReal( sc.nextInt() );
		System.out.print("Imag Number	:	");
		c.setImag(sc.nextInt());
		
		System.out.println("Real Number	:	"+c.getReal());
		System.out.println("Real Number	:	"+c.getImag());
	}
}
