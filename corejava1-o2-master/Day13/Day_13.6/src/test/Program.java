package test;

import java.util.Date;
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
		Box<Number> b1 = new Box<>();	//OK
		
		Box<Integer> b2 = new Box<>();	//OK
		
		Box<Double> b3 = new Box<>();	//OK
		
		Box<Boolean> b4 = new Box<>();	//OK
		
		Box<String> b5  = new Box<>();	//OK
		
		Box<Date> b6 = new Box<>();	//OK
		
		Box<Program> b7 = new Box<>();	//OK
	}
}
