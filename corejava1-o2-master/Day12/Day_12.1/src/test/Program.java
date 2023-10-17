package test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		String str = "SunBeam Infotech Pune";
		String sbString = str.substring( 8,16 );
		System.out.println(sbString);
	}
	public static void main5(String[] args) {
		String str = "SunBeam Infotech Pune";
		String sbString = str.substring( 8 );
		System.out.println(sbString);
		//String sbString = str.substring( 7 );
		//System.out.println(sbString.trim());
	}
	public static void main4(String[] args) {
		String str = "www.yahoo.com";
		String regex  = "\\.";
		String[] words = str.split(regex);
		for (String word : words) {
			System.out.println(word);
		}
	}
	public static void main3(String[] args) {
		String str = "SunBeam Infotech Pune";
		String regex  = " ";
		String[] words = str.split(regex);
		for (String word : words) {
			System.out.println(word);
		}
	}
	public static void main2(String[] args) {
		String str = "SunBeam";
		char ch = str.charAt( str.length() );	//StringIndexOutOfBoundsException
		System.out.println(ch);	//7
	}
	public static void main1(String[] args) {
		String str = "SunBeam";
		System.out.println(str.length());	//7
	}
}
