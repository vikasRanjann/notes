package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String pathname) throws Exception{
		try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));) {
			outputStream.writeUTF("Sandeep");
			outputStream.writeInt(33);
			outputStream.writeFloat(25000.45f);
		} 
	}
	private static void readRecord(String pathname)throws Exception {
		try( DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathname)))); ) {
			String name = inputStream.readUTF();
			int empid = inputStream.readInt();
			float salary = inputStream.readFloat();
			System.out.println(name+"	"+empid+"	"+salary);
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
