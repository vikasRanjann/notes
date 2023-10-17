package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.Book;

public class Program {
	
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/cjonline_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	
	private static Book getRow(ResultSet rs) throws Exception{
		Book book = new Book();
		book.setBookId(rs.getInt("book_id"));
		book.setSubjectName(rs.getString("subject_name"));
		book.setBookName(rs.getString("book_name"));
		book.setAuthorName(rs.getString("author_name"));
		book.setPrice(rs.getFloat("price"));
		return book;
	}
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql = "SELECT book_id, subject_name, book_name, author_name, price FROM BookTable";
			try( ResultSet rs = statement.executeQuery(sql)){
				if(rs.last()) {
					rs.moveToInsertRow();
					rs.updateInt("book_id", 1027);
					rs.updateString("subject_name", "OS");
					rs.updateString("book_name", "OS Concepts");
					rs.updateString("author_name", "Galvin" );
					rs.updateFloat("price", 550 );
					rs.insertRow();
					rs.moveToCurrentRow();
					
					Book book = getRow(rs);
					System.out.println(book);
				}
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
