package test;

import java.util.Date;

//class Box<T> <= Parameterized Type
class Box<T>	//T <= Type Parameter
{
	private T object;	
	public T getObject() {
		return object;
	}
	public void setObject(T object) { 
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		//Box<int> b1 = new Box<>();	//Not OK
		Box<Integer> b1 = new Box<>();	//OK
		b1.setObject(10);
	}
	public static void main3(String[] args) {
		Box b1 = new Box();	//Box <= Raw Type
		//Box<Object> b1 = new Box<>();
	}
	public static void main2(String[] args) {
		Box<Date> b1 = new Box<>();	//Date <= Type Argument
		b1.setObject( new Date() );
		Date date = b1.getObject(); 
	}
	public static void main1(String[] args) {
		Box<Date> b1 = new Box<Date>();	//Date <= Type Argument
		b1.setObject( new Date() );
		Date date = b1.getObject(); 
	}
}
