package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {
	public static void main(String[] args) {
		String str = "ab+bc*cd-de/ef";
		String delim = "+*-/";
		StringTokenizer stk = new StringTokenizer(str, delim, false);
		while( stk.hasMoreTokens()) {
			String token =  stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main5(String[] args) {
		String str = "ab+bc*cd-de/ef";
		String delim = "+*-/";
		StringTokenizer stk = new StringTokenizer(str, delim);
		while( stk.hasMoreTokens()) {
			String token =  stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main4(String[] args) {
		String str = "www.sunbeaminfo.com";
		String delim = ".";
		StringTokenizer stk = new StringTokenizer(str, delim);
		while( stk.hasMoreTokens()) {
			String token =  stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main3(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		while( stk.hasMoreTokens()) {
			String token =  stk.nextToken();
			System.out.println(token);
		}
	}
	public static void main2(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		while( stk.hasMoreElements()) {
			String token =  (String) stk.nextElement();
			System.out.println(token);
		}
	}	
	public static void main1(String[] args) {
		String str = "SunBeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println(stk.countTokens());
	}	
}
