package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static Account[] getKeys( ) {
		Account[] arr = new Account[ 5 ];
		arr[ 0 ] = new Account(4125,"Saving",25000);
		arr[ 1 ] = new Account(3153,"Current", 57000);
		arr[ 2 ] = new Account(2441,"Loan",125000);
		arr[ 3 ] = new Account(5783,"Pention",40000);
		arr[ 4 ] = new Account(3169,"Joint",50000);
		return arr;
	}
	public static Customer[] getValues( ) {
		Customer[] arr = new Customer[ 5 ];
		arr[ 0 ] = new Customer("Amol","amol@gmail.com","11111");
		arr[ 1 ] = new Customer("Digvijay","dvijay@yahoo.com","22222");
		arr[ 2 ] = new Customer("Nilesh","nilesh@gmail.com","33333");
		arr[ 3 ] = new Customer("Rahul","rahul@gmail.com","444444");
		arr[ 4 ] = new Customer("Sonal","sonal@yahoo.com","555555");
		return arr;
	}
	private static void acceptRecord(int[] number) {
		if( number != null ) {
			System.out.print("Enter account number	:	");
			number[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Customer value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus )
			System.out.println("Account is removed");
		else
			System.out.println("Account not found");
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Record(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		
		MapTest test  = new MapTest();
		//test.setMap(new Hashtable<>());
		//test.setMap(new HashMap<>());
		//test.setMap(new LinkedHashMap<>());
		test.setMap(new TreeMap<>());
		int[] number = new int[ 1 ];
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.addRecord( Program.getKeys(), Program.getValues());
				break;
			case 2:
				Program.acceptRecord( number );
				Customer value =  test.findRecord( number[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord( number );
				boolean removedStatus = test.removeRecord( number[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				test.printRecord( );
				break;
			}
		}
	}
}
