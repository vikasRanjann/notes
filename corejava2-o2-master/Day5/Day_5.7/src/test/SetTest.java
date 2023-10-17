package test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	public void writeRecord(String pathname)throws Exception {
		if( this.empList  != null ) {
			try(ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))))){
				outputStream.writeObject(this.empList);
			}
		}
	}
	@SuppressWarnings("unchecked")
	public void readRecord(String pathname) throws Exception{
		if(this.empList != null) {
			try( ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))))){
				this.empList = (Set<Employee>) inputStream.readObject();
			}
		}
	}
}