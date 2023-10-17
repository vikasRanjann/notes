package test;
class Person{
	private String name;
	private int age;
	public Person() {
		this.name = "";
		this.age = 0;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}
class Employee extends Person{
	private int empid;
	private float salary;
	public Employee() {
		//super(); //Optional
		this.empid = 0;
		this.salary = 0;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		super( name, age );	
		this.empid = empid;
		this.salary = salary;
	}
	
	public void displayRecord( ) {
		this.showRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Person p1 = new Person();
		//Person p2 = new Person("ABC",25);
		//Employee emp = new Employee();
		Employee emp = new Employee("Abc",25, 478, 15000);
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		//emp.showRecord();
		emp.displayRecord();
	}
}
