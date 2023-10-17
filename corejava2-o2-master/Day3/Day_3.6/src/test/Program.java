package test;
class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandeep",33,45000);
		System.out.println(emp1.hashCode());
		
		Employee emp2 = new Employee("Sandeep",33,45000);
		System.out.println(emp2.hashCode());
	}
}