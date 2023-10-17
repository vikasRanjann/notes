package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter F.Q. Class Name	:	");
			String className = sc.nextLine();	//java.lang.Thread
			Class<?> c = Class.forName(className);
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		Class<?> c = Number.class;
	}
	public static void main1(String[] args) {
		Integer number = new Integer(125);
		Class<?> c = number.getClass();
	}
}
