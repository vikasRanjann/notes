package test;
import java.util.Set;

public class SetTest{
	private Set<Employee> empList;
	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}
	public void addRecord(Employee[] arr) {
		if( arr != null && this.empList != null ) {
			for( Employee emp : arr ) 
				this.empList.add(emp);
		}
	}
	public Employee findRecord(int empid) {
		if( this.empList != null ) {
			for( Employee emp : this.empList) {
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		return null;
	}
	public boolean removeRecord(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee( empid );
			if( this.empList.contains(key)) {
				this.empList.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printRecord() {
		if( this.empList != null ) {
			this.empList.forEach(System.out::println);
		}
	}
}