package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String pathname) throws Exception{
		try( BufferedWriter writer = new BufferedWriter(new FileWriter(new File(pathname)))){
			writer.write("SunBeam Infotech Pune");
			writer.newLine();
			writer.write("ATC CDAC, PUNE");
			writer.newLine();
			writer.write("Rajiv Gandhi IT Park Hinjewadi");
			writer.newLine();
			writer.write("Pincode - 411057");
		}
	}
	private static void readRecord(String pathname)throws Exception {
		try( BufferedReader reader = new  BufferedReader(new FileReader(new File(pathname)))){
			String line = null;
			while( ( line = reader.readLine( ) ) != null )
				System.out.println(line);
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
		String pathname = "File.txt";
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
