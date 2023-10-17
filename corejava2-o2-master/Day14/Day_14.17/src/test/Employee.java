package test;


public class Employee {
	private int empid;
	private String name,desgination, joinDate;
	private float salary;
	private String department;
	public Employee() {
	}
	public Employee(int empid, String name, String desgination, String joinDate, float salary, String department) {
		this.empid = empid;
		this.name = name;
		this.desgination = desgination;
		this.joinDate = joinDate;
		this.salary = salary;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-15s%-15s%-15s%-8.2f%-15s", this.empid, this.name, this.desgination, this.joinDate, this.salary, this.department);
	}
}
