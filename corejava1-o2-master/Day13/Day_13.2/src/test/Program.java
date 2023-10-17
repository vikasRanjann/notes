package test;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Object o4 = null;
		String s4 = (String) o4;	//null
		System.out.println(s4);
	}
	public static void main3(String[] args) {
		Object o3 = new Date();
		String s3 = (String) o3; //ClassCastException
		System.out.println(s3);
	}
	public static void main2(String[] args) {
		Object o2 = new Date();
		Date d1 = (Date) o2;	//Ok
		System.out.println(d1);
	}
	public static void main1(String[] args) {
		Object o1 = new  String("Sandeep");
		String s1 = (String) o1;	//Ok
		System.out.println(s1);
	}
}
