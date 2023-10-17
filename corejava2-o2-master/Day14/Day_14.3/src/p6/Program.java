package p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Program {
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Ganesh",15,85000);
		arr[ 1 ] = new Employee("Rajiv",11,30000);
		arr[ 2 ] = new Employee("Devendra",14, 52000);
		arr[ 3 ] = new Employee("Sambhaji",13, 58000);
		arr[ 4 ] = new Employee("Abhijit",12,45000);
		return arr;
	}
	public static List<Employee> getEmpList ( ){
		List<Employee> list = new ArrayList<Employee>();
		for (Employee emp : getEmployees()) 
			list.add(emp);
		return list;
	}
	public static void main(String[] args) {
		List<Employee> employees = Program.getEmpList();
		//employees.stream().sorted((e1, e2)->e1.getEmpid() - e2.getEmpid()).forEach(System.out::println);
		//employees.stream().sorted(Comparator.comparing(Employee::getEmpid).reversed()).forEach(System.out::println);
		employees.stream().sorted(Comparator.comparing(Employee::getEmpid).reversed()).map(Employee::getName).forEach(System.out::println);
	}
}
