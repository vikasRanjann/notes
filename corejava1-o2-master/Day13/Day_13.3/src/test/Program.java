package test;

import java.util.Date;

class Box{
	private Object object;	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		Date date = new Date();
		Box b4 = new Box();
		b4.setObject(date);
		
		//Date dt = (Date) b4.getObject();	//OK
		//System.out.println(dt);
		
		String str = (String) b4.getObject(); //ClassCastException
		System.out.println(str);
	}
	public static void main3(String[] args) {
		Date date = new Date();
		Box b3 = new Box();
		b3.setObject(date);
	}
	public static void main2(String[] args) {
		int number = 10;
		Box b2 = new Box();
		b2.setObject(number);	//b2.setObject(Integer.valueOf(number));
	}
	public static void main1(String[] args) {
		Box b1 = new Box();
	}
}
