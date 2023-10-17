package p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Program {
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 13 ];
		
		arr[ 0 ] = new Employee(7369,"SMITH","CLERK","1980-12-17",800.00f,"RESEARCH");

		arr[ 1 ] = new Employee(7499,"ALLEN","SALESMAN","1981-02-20",1600.00f,"SALES");

		arr[ 2 ] = new Employee(7521,"WARD","SALESMAN","1981-02-22",1250.00f,"SALES");

		arr[ 3 ] = new Employee(7566,"JONES","MANAGER","1981-04-02",2975.00f,"RESEARCH");

		arr[ 4 ] = new Employee(7654,"MARTIN","SALESMAN","1981-09-28",1250.00f,"SALES");

		arr[ 5 ] = new Employee(7698,"BLAKE","MANAGER","1981-05-01",2850.00f,"SALES");

		arr[ 6 ] = new Employee(7782,"CLARK","MANAGER","1981-06-09",2450.00f,"ACCOUNTING");

		arr[ 7 ] = new Employee(7788,"SCOTT","ANALYST","1982-12-09",3000.00f,"RESEARCH");

		arr[ 8 ] = new Employee(7839,"KING","PRESIDENT","1981-11-17",5000.00f,"ACCOUNTING");

		arr[ 8 ] = new Employee(7844,"TURNER","SALESMAN","1981-09-08",1500.00f,"SALES");

		arr[ 9 ] = new Employee(7876,"ADAMS","CLERK","1983-01-12",1100.00f,"RESEARCH");

		arr[ 10 ] = new Employee(7900,"JAMES","CLERK","1981-12-03",950.00f,"SALES");

		arr[ 11 ] = new Employee(7902,"FORD","ANALYST","1981-12-03",3000.00f,"RESEARCH");

		arr[ 12 ] = new Employee(7934,"MILLER","CLERK","1982-01-23",1300.00f,"ACCOUNTING");
		
		return arr;
	}
	public static List<Employee> getEmpList ( ){
		List<Employee> list = new ArrayList<Employee>();
		for (Employee emp : getEmployees()) 
			list.add(emp);
		return list;
	}
	public static void main1(String[] args) {
		List<Employee> empList = Program.getEmpList();
		Map<String, List<Employee>> empDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entries = empDept.entrySet();
		for (Entry<String, List<Employee>> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println("----------");
			entry.getValue().forEach(System.out::println);
			System.out.println("----------");
		}
		
	}
	public static void main(String[] args) {
		List<Employee> empList = Program.getEmpList();
		Map<String, Long> empDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> en = empDept.entrySet();
		for (Entry<String, Long> entry : en) {
			System.out.println(entry);
		}
	}
}
