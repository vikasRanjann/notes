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
class Employee{
	private String name;
	private int age;
	private int empid;
	private float salary;
	public Employee() {
		this.name = "";
		this.age = 0;
		this.empid = 0;
		this.salary = 0;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}

	public void displayRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee("Abc",36, 478, 25000);
		emp.displayRecord();
	}
	public static void main1(String[] args) {
		//Person p = new Person();
		Person p = new Person("Abc",36);
		p.showRecord();
	}
}
