package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void writeRecord(String pathname) {
		FileOutputStream  outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(pathname));
			outputStream.write('A');
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void readRecord(String pathname) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(pathname));
			int data = inputStream.read( );
			System.out.println((char)data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		String pathname = "File.dat";
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Program.writeRecord( pathname );
				break;
			case 2:
				Program.readRecord( pathname );
				break;
			}
		}
	}
}
