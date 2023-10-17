package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
		final int number = sc.nextInt();	//OK
		//number = 200;	//Not OK
		System.out.println("Number	:	"+number);
	}
	public static void main2(String[] args) {
		final int number;
		number = 20;	//Assignment : OK
		//number = 30;	//Assignment : Not OK
		System.out.println("Number	:	"+number);
	}
	public static void main1(String[] args) {
		final int number = 10;	//Initialization
		//number = number + 1;	//Not OK
		System.out.println("Number	:	"+number);
	}
}
