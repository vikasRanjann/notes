package test;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DBUtils;
public class Program {
	public static void main(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			 Statement statement = connection.createStatement( ); ) {
			String sql = "SELECT book_id, subject_name, book_name, author_name, price FROM BookTable";
			ResultSet rs = statement.executeQuery( sql );
			List<Book> books = new ArrayList<Book>();
			while( rs.next( ) ) {
				Book book = new Book(rs.getInt("book_id"),rs.getNString("subject_name"), rs.getString("book_name"), rs.getString("author_name"), rs.getFloat("price"));
				books.add(book);
			}
			books.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
