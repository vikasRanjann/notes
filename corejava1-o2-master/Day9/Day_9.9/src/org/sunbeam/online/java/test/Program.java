package org.sunbeam.online.java.test;
class Math{
	public static int power( int base, int index ){
		int result = 1;
		for( int count = 1; count <= index; ++ count ) {
			result = result * base;
		}
		return result;
	}
}
public class Program {
	public static void main(String[] args) {
		int res = Math.power(10, 2);
		System.out.println(res);
	}
}
