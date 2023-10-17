package test;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable{
	private static final long serialVersionUID = 3975425110753133739L;
	private String name;
	private int empid;
	private float salary;
	public Employee() {
	}
	public Employee( int empid ) {
		this.empid = empid;
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee other) {
		return this.empid  - other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}