package test;

import java.util.List;
import java.util.Scanner;

import dao.BookDao;
import pojo.Book;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Book book) {
		if(  book != null ) {
			System.out.print("Book Id	:	");
			book.setBookId(sc.nextInt());
			System.out.print("Subject Name	:	");
			sc.nextLine();
			book.setSubjectName(sc.nextLine());
			System.out.print("Book Name	:	");
			book.setBookName(sc.nextLine());
			System.out.print("Author Name	:	");
			book.setAuthorName(sc.nextLine());
			System.out.print("Price	:	");
			book.setPrice(sc.nextFloat());
		}
	}
	private static void acceptRecord(int[] bookId) {
		if( bookId != null ) {
			System.out.print("Enter book id	:	");
			bookId[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Book book) {
		if( book != null )
			System.out.println(book.toString());
	}
	private static void printRecord(List<Book> books) {
		if( books != null ) {
			books.forEach(System.out::println);
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Find Book ");
		System.out.println("3.Update Book ");
		System.out.println("4.Remove Book");
		System.out.println("5.Print Book(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		try( BookDao dao = new BookDao()){
			int choice, count;
			int[] bookId = new int[ 1 ];
			while( ( choice = Program.menuList( ) ) != 0 ){
				Book book = null;
				switch( choice ) {
				case 1:
					 book = new Book();
					Program.acceptRecord(book);
					dao.insert(book);
					break;
				case 2:
					Program.acceptRecord( bookId );
					book = dao.find( bookId[ 0 ] );
					Program.printRecord(book);
					break;
				case 3:
					Program.acceptRecord( bookId );
					dao.update(bookId[0], 5700);
					//TODO
					break;
				case 4:
					Program.acceptRecord( bookId );
					 dao.delete( bookId[ 0 ] );
					 //TODO
					break;
				case 5:
					List<Book> books = dao.getBooks();
					Program.printRecord( books );
					break;
				}
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
