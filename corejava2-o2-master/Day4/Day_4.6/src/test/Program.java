package test;

import java.io.File;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String pathname= "Temp";
		File file = new File(pathname);
		if(file.delete())
			System.out.println("Directory is removed");
		else
			System.out.println("IO error");
	}
	public static void main3(String[] args) {
		String pathname= "Temp";
		File file = new File(pathname);
		if(file.mkdir())
			System.out.println("Directory is created");
		else
			System.out.println("IO error");
	}
	public static void main2(String[] args) {	
		String pathname= "./src/File.txt";
		File file = new File(pathname);
		if(file.delete())
			System.out.println("File is removed");
		else
			System.out.println("File IO error");
	}
	public static void main1(String[] args) {
		try {
			String pathname= "./src/File.txt";
			File file = new File(pathname);
			if(file.createNewFile())
				System.out.println("File is created");
			else
				System.out.println("File IO error");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
