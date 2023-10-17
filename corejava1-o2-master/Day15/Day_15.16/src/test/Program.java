package test;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	/*@Override
	public int compareTo(Employee other) {
		if( this.empid < other.empid )
			return -1;
		else if( this.empid > other.empid )
			return 1;
		else
			return 0;
	}*/
	/*@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}*/
	/*@Override
	public int compareTo(Employee other) {
		return (int) (this.salary - other.salary);
	}*/
	@Override
	public int compareTo(Employee other) {
		return this.name.compareTo(other.name);
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
public class Program {	
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Sachin", 50 , 50000);
		arr[ 1 ] = new Employee("Yogesh", 20 , 45000);
		arr[ 2 ] = new Employee("Akash", 10 , 40000);
		arr[ 3 ] = new Employee("Umesh", 40 , 35000);
		arr[ 4 ] = new Employee("Digvijay", 30 , 30000);
		return arr;
	}
	private static void printRecord(Employee[] arr) {
		if( arr != null ) {
			for (Employee emp : arr) 	
				System.out.println(emp.toString());
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		Program.printRecord( arr );
		Arrays.sort( arr );
		Program.printRecord( arr );
	}
	public static void main1(String[] args) {
		int[] arr = new int[ ] { 50, 10, 20, 40, 30 };
		Arrays.sort( arr );
		System.out.println(Arrays.toString( arr ) ) ;
	}
}
