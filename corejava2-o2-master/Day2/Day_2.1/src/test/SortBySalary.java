package test;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}
