package test;

import java.util.Comparator;

public class SortByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpid() - e2.getEmpid();
	}
}
