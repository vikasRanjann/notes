package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String pathname) throws Exception{
		try(FileOutputStream outputStream = new FileOutputStream(new File(pathname));) {
			for( char ch = 'A'; ch <= 'Z'; ++ ch )
				outputStream.write( ch );
		} 
	}
	private static void readRecord(String pathname)throws Exception {
		try( FileInputStream inputStream = new FileInputStream(new File(pathname)); ) {
			int data;
			while( ( data = inputStream.read( ) ) != -1 ){
				System.out.print((char)data+" ");
			}
			System.out.println();
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
			try {
				switch( choice ) {
				case 1:
					Program.writeRecord( pathname );
					break;
				case 2:
					Program.readRecord( pathname );
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
