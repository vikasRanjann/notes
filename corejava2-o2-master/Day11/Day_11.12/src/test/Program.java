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
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			int bookId = 1026;
			String subjectName = "OS", book_name = "OS Concept's", authorName = "Galvin";
			float price = 450;
			
			String sql = "INSERT INTO BookTable VALUES("+bookId+",'"+subjectName+"','"+book_name+"','"+authorName+"',"+price+")"; //DML
			int count = statement.executeUpdate(sql);
			
			System.out.println(count+" Record inserted.");
			
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

