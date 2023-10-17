package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Path : ");
		String pathname =  sc.nextLine();
		File file = new File(pathname);
		if( file.exists()) {
			if( file.isDirectory()) {
				/*String[] list = file.list();
				for( String name : list )
					System.out.println(name);*/
				
				File[] files = file.listFiles();
				for (File f : files) {
					if( !f.isHidden() )
					{
						if( f.isFile() )
							System.out.println(f.getName()+"	:	File");
						else
							System.out.println(f.getName()+"	:	DIR");
					}
				}
			}
			else {
				System.out.println("Name	:	"+file.getName());
				System.out.println("Parent	:	"+file.getParent());
				System.out.println("Length	:	"+file.length());
				SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
				String date =  sdf.format(new Date(file.lastModified()));
				System.out.println("Last Modified	:	"+date);
			}
		}
		else
			System.out.println(pathname+" does not exist");
	}
}
