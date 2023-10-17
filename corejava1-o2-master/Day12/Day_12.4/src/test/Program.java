package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1	:	");
		System.out.println(Integer.parseInt(new StringBuffer(String.valueOf(sc.nextInt())).reverse().toString()));
	}
	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1	:	");
		int num1 = sc.nextInt();
		String strNumber = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(strNumber);
		sb.reverse();
		strNumber = sb.toString();
		int num2 = Integer.parseInt(strNumber);
		System.out.println(num2);
	}
	public static void main5(String[] args) {
		StringBuffer sb1 = new StringBuffer("SunBeam Infotech Pune");
		System.out.println(sb1);
		String str = "Karad";
		sb1.replace(17, 21, str);
		System.out.println(sb1);
	}
	public static void main4(String[] args) {
		StringBuilder sb1 = new StringBuilder("SunBeam");
		StringBuilder sb2 = new StringBuilder("SunBeam");
		if( sb1.equals(sb2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main3(String[] args) {
		StringBuilder sb1 = new StringBuilder("SunBeam");
		StringBuilder sb2 = new StringBuilder("SunBeam");
		if( sb1 == sb2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main2(String[] args) {
		StringBuffer sb1 = new StringBuffer("SunBeam");
		StringBuffer sb2 = new StringBuffer("SunBeam");
		if( sb1.equals(sb2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main1(String[] args) {
		StringBuffer sb1 = new StringBuffer("SunBeam");
		StringBuffer sb2 = new StringBuffer("SunBeam");
		if( sb1 == sb2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
}
