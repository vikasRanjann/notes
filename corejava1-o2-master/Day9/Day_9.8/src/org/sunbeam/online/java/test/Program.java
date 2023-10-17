package org.sunbeam.online.java.test;
class Test{
	private int num1;	//Instance variable;
	private int num2;	//Instance variable;
	private static int num3;	//class level variable;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public static void setNum3(int num3) {
		Test.num3 = num3;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+Test.num3);
	}
	public static void f1( ) {
		Test t1 = new Test(  );
		t1.setNum1( 10 );
		t1.setNum2( 20 );
		Test.setNum3( 30 );
		t1.printRecord( );
	}
}
public class Program {
	public int num1 = 10;
	public static int num2 = 20;
	public static void main(String[] args) {
		//System.out.println("Num1	:	"+num1);	//Not OK
		
		Program p = new Program();
		System.out.println("Num1	:	"+p.num1);	//OK
		
		System.out.println("Num2	:	"+num2);	//OK
		System.out.println("Num2	:	"+Program.num2);	//OK
	}
	public static void main2(String[] args) {
		Test.f1();
	}
	public static void main1(String[] args) {
		Test t1 = new Test(  );
		//t1.num1 = 10; //Not Ok
		t1.setNum1( 10 );
		//t1.num2 = 20; //Not Ok
		t1.setNum2( 20 );
		//Test.num3 = 30;	//Not OK
		Test.setNum3( 30 );
		t1.printRecord( );
	}
}
