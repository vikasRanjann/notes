package test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
public class Program {
	static Scanner sc = new Scanner(System.in);
	private static Employee[] getEmployees() {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Nitin",13, 50000);
		arr[ 1 ] = new Employee("Amit",10, 45000);
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
		System.out.println("3.Update Record");
		System.out.println("4.Remove Record");
		System.out.println("5.Print Record(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static int subMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sort By Name");
		System.out.println("2.Sort By Empid");
		System.out.println("3.Sort By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		ListTest test = new ListTest();
		//test.setEmpList(new ArrayList<>());
		test.setEmpList(new Vector<>());
		//test.setEmpList(new LinkedList<>());
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
				boolean updateStatus = test.updateRecord(empid[0], 75000);
				break;
			case 4:
				Program.acceptRecord( empid );
				boolean removeStatus = test.removeRecord( empid[ 0 ] );
				Program.printRecord(removeStatus);
				break;
			case 5:
				while( ( choice = Program.subMenuList( ) ) != 0 ) {
					Comparator<Employee> comparator = null;
					switch( choice ) {
					case 1:
						comparator = Comparator.comparing(Employee::getName);
						break;
					case 2:
						comparator = Comparator.comparing(Employee::getEmpid);
						break;
					case 3:
						comparator = Comparator.comparing(Employee::getSalary);
						break;
					}
					test.printRecord( comparator );
				}
				break;
			/*case 4:
				while( ( choice = Program.subMenuList( ) ) != 0 ) {
					Comparator<Employee> comparator = null;
					switch( choice ) {
					case 1:
						comparator = (e1,e2)->e1.getName().compareTo(e2.getName());
						break;
					case 2:
						comparator = (e1,e2)->e1.getEmpid()-e2.getEmpid();
						break;
					case 3:
						comparator = (e1,e2)->(int)(e1.getSalary() - e2.getSalary());
						break;
					}
					test.printRecord( comparator );
				}
				break;*/
			/*case 4:
				while( ( choice = Program.subMenuList( ) ) != 0 ) {
					Comparator<Employee> comparator = null;
					switch( choice ) {
					case 1:
						comparator = new SortByName();
						break;
					case 2:
						comparator = new SortByEmpid();
						break;
					case 3:
						comparator = new SortBySalary();
						break;
					}
					test.printRecord( comparator );
				}
				break;*/
			}
		}
	}
}
