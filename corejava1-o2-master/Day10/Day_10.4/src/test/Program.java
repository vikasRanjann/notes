package test;

import java.util.Scanner;

enum Color {
	RED, GREEN, BLUE // RED,GREEN, BLUE <= Name --> name()
	// RED=0, GREEN=1, BLUE=2 //0,1,2 <= Ordinal --> ordinal()
}
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		String name = sc.nextLine();	//RED, GREEN, BLUE
		Color color = Color.valueOf(name.toUpperCase());
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());
	}
	public static void main5(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		String name = sc.nextLine();	//RED, GREEN, BLUE
		Color color = Color.valueOf(name.toUpperCase());
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());
	}

	public static void main4(String[] args) {
		Color[] colors = Color.values();
		for (Color color : colors) {
			System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());
		}
	}

	public static void main3(String[] args) {
		Color color = Color.RED;
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());

		color = Color.GREEN;
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());

		color = Color.BLUE;
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());
	}

	public static void main2(String[] args) {
		Color color = Color.RED;
		System.out.printf("%-10s%-5d\n", color.name(), color.ordinal());
	}

	public static void main1(String[] args) {
		String name = Color.RED.name();
		int ordinal = Color.RED.ordinal();
		System.out.printf("%-10s%-5d\n", name, ordinal);
	}
}
