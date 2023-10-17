package test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		byte[] bs = { 97, 98, 99 };
		String str = new String(bs);
		System.out.println(str);
	}
	public static void main1(String[] args) {
		String str = "abc";
		byte[] bs = str.getBytes();
		System.out.println(Arrays.toString( bs ));
	}
}
