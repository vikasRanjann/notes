package org.sunbeam.online.java.test;
class Test{
	private int num1;	//Instance variable;
	private int num2;	//Instance variable;
	private static int num3;	//class level variable;
	
	//Static Initializer block
	static{
		Test.num3 = 500;
	}
	public Test( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+Test.num3);
	}
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new Test( 10, 20 );
		t1.printRecord( );
	}
}
