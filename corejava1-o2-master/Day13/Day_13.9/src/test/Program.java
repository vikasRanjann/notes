package test;

import java.util.Date;

public class Program {
	public static void print1( Object obj ) {
		System.out.println(obj);
	}
	
	public static <T> void print2( T obj ) {
		System.out.println(obj);
	}
	public static <T extends Number > void print( T obj ) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program.print('A');
		Program.print(true);
		Program.print(10);
		Program.print(10.5);
		Program.print("SunBeam");
		Program.print( new Date());
	}
}
