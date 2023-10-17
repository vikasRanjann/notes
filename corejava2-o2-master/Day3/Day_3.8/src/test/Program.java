package test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Program {
	static Scanner sc = new Scanner(System.in);
	private static Employee[] getEmployees() {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Nitin",13, 50000);
		arr[ 1 ] = new Employee("Amit",11, 45000);
		arr[ 2 ] = new Employee("Sarang",15, 40000);
		arr[ 3 ] = new Employee("Yogesh",14, 25000);
		arr[ 4 ] = new Employee("Digvijay",12, 30000);
		return arr;
	}
	private static void acceptRecord(int[] empid) {
		if( empid != null ) {
			System.out.print("Enter Empid	:	");
			empid[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(boolean removeStatus) {
		if(removeStatus)
			System.out.println("Employee is removed");
		else
			System.out.println("Employee not found");
	}
	private static void printRecord(Employee value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Employee not found");
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
		
		SetTest test = new SetTest();
		//test.setEmpList(new TreeSet<>( new SortByEmpid( ) ) );
		//test.setEmpList(new TreeSet<>( ) );
		//test.setEmpList(new HashSet<>() );
		test.setEmpList(new LinkedHashSet<>());
		
		int[] empid = new int[1];
		while( ( choice = Program.menuList( ) ) != 0 ){
			switch(choice) {
			case 1:
				test.addRecord(Program.getEmployees());
				break;
			case 2:
				Program.acceptRecord( empid );
				Employee value =  test.findRecord( empid[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord( empid );
				boolean removeStatus = test.removeRecord( empid[ 0 ] );
				Program.printRecord(removeStatus);
				break;
			case 4:
				test.printRecord();
				break;
			}
		}
	}
}
