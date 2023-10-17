package test;

import java.util.Arrays;
import java.util.Comparator;

class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getEmpid() {
		return empid;
	}
	public float getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
class SortByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpid() - e2.getEmpid();
	}
}
class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
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
	/*private static void printRecord(Employee[] arr) {
		if( arr != null ) {
			for (Employee emp : arr) 	
				System.out.println(emp.toString());
			System.out.println();
		}
	}*/
	
	private static void printRecord(Employee[] arr, Comparator<Employee> c ) {
		if( arr != null ) {
			Arrays.sort( arr, c );
			for (Employee emp : arr) 	
				System.out.println(emp.toString());
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		
		Program.printRecord( arr, (e1,e2)->e1.getName().compareTo(e2.getName()) );
		
		Program.printRecord( arr, (e1,e2)->e1.getEmpid() - e2.getEmpid() );
		
		Program.printRecord( arr, (e1,e2)-> (int)(e1.getSalary() - e2.getSalary()) );
	}
	public static void main2(String[] args) {
		Employee[] arr = Program.getEmployees();
		
		Program.printRecord( arr, new SortByName() );
		
		Program.printRecord( arr, new SortByEmpid() );
		
		Program.printRecord( arr, new SortBySalary() );
	}
	/*public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		//Program.printRecord( arr );
		Comparator<Employee> comparator = null;
		
		comparator = new SortByName();
		Arrays.sort( arr, comparator );
		Program.printRecord( arr );
		
		comparator = new SortByEmpid();
		Arrays.sort( arr, comparator );
		Program.printRecord( arr );
		
		comparator = new SortBySalary();
		Arrays.sort( arr, comparator );
		Program.printRecord( arr );
	}*/
	public static void main1(String[] args) {
		int[] arr = new int[ ] { 50, 10, 20, 40, 30 };
		Arrays.sort( arr );
		System.out.println(Arrays.toString( arr ) ) ;
	}
}
