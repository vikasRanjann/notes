package org.sunbeam.online.java.test;

import java.util.Scanner;

import org.sunbeam.online.java.lib.Address;
import org.sunbeam.online.java.lib.Date;
import org.sunbeam.online.java.lib.Person;

enum AssocitationOperation{
	EXIT, DATE, ADDRESS, PERSON
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( Date date) {
		System.out.print("Day	:	");
		date.setDay(sc.nextInt());
		System.out.print("Month	:	");
		date.setMonth(sc.nextInt());
		System.out.print("Year	:	");
		date.setYear(sc.nextInt());
	}
	public static void printRecord( Date date ) {
		//System.out.println(date.toString()); //OK
		System.out.printf("%d/%d/%d\n", date.getDay(), date.getMonth(), date.getYear());
	}
	public static void acceptRecord( Address address ) {
		//TODO : call setter on address	
	}
	public static void printRecord( Address address ) {
		//TODO : Call getter/toString on address
	}
	public static void acceptRecord( Person person ) {
		//TODO : call setter on person
	}
	public static void printRecord( Person person ) {
		//TODO : Call getter/toString on person
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Date");
		System.out.println("2.Address");
		System.out.println("3.Person");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Date date = new Date();
				Program.acceptRecord(date);
				Program.printRecord(date);
				break;
			case 2:
				Address address = new Address();
				Program.acceptRecord(address);
				Program.printRecord(address);
				break;
			case 3:
				Person person = new Person();
				Program.acceptRecord(person);
				Program.printRecord(person);
				break;
			}
		}
	}
}
