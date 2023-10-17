package test;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// /Users/sandeepkulange/Documents/DBT/assign
// /Users/sandeepkulange/Documents/DBT/assign/assign1.txt
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static String getName( ) {
		System.out.print("Path:/>");
		return sc.nextLine();
	}
	public static String getDateTime( long milliSeconds ) {
		//11 July 2019 at 11:58 AM
		return new SimpleDateFormat("dd MMM yyyy 'at' h:mm a").format(new Date(milliSeconds));
		
	}
	public static void main(String[] args) {
		try {
			Path path = Paths.get(Program.getName());
			if( Files.exists(path)) {
				System.out.println("Dir Name	:	"+path.getFileName());
				System.out.println("Parent		:	"+path.getParent());
				if( Files.isDirectory(path)) {
					List<Path> list = Files.list(path).collect(Collectors.toList());
					for (Path p : list) {
						if( Files.isDirectory(p))
							System.out.println(p.getFileName()+"<Dir>");
						else
							System.out.println(p.getFileName()+"<File>");
					}
					
				}else if(Files.isRegularFile(path)){
					System.out.println("Size		:	"+Files.size(path)+" bytes");
					BasicFileAttributes fa = Files.readAttributes(path, BasicFileAttributes.class);
					System.out.println("Creation Time	:	"+Program.getDateTime(fa.creationTime().toMillis()));
					System.out.println("Last Modified Time :	"+Program.getDateTime(fa.lastModifiedTime().toMillis()));
					System.out.println("Last Access Time :	"+Program.getDateTime(fa.lastAccessTime().toMillis()));
				}
				else {
					FileStore store = Files.getFileStore(path);
					long total = store.getTotalSpace() / 1024;
					System.out.println("Total Space	:	"+total);
					long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / 1024;
					System.out.println("Used Space	:	"+used);
					long avail = store.getUsableSpace() / 1024;
					System.out.println("Available Space	"+avail);
				}
			}
			else
				System.out.println(path+" does not exist");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}