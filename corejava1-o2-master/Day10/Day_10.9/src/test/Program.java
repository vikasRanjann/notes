package test;
import java.util.Scanner;

enum StackOperation{
	EXIT, PUSH, POP
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	static StackOperation menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return StackOperation.values()[ sc.nextInt() ];
		
		
		/* StackOperation[] arr = StackOperation.values();
		return arr[ sc.nextInt() ];*/
		
		/*int choice = sc.nextInt();
		StackOperation[] arr = StackOperation.values();
		return arr[ choice ];*/
	}
	public static void main(String[] args) {
		StackOperation choice;
		while( ( choice = Program.menuList( ) ) != StackOperation.EXIT ) {
			switch( choice ) {
			case PUSH:
				System.out.println("Push");
				break;
			case POP:
				System.out.println("Pop");
				break;
			}
		}
	}
}
