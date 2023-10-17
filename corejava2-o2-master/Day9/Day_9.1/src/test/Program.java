package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Step 0 : include db connector into classpath/build path
public class Program {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/cjonline_db";
	public static final String USER = "sandeep";
	public static final String PASSWRD = "sandeep";
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			//step 1 : Load and register driver
			Class.forName( DRIVER );
			//step 2 : Establish connection using users credentials
			connection = DriverManager.getConnection(URL, USER, PASSWRD);
			//Step 3 : Create Statement
			statement = connection.createStatement();
			//Step 4 : Prepare and execute query
			String sql = "SELECT book_id, subject_name, book_name, author_name, price FROM BookTable";
			// FOR DML : int executeUpdate( sql )
			// FOR DQL : ResultSet executeQuery( sql )
			ResultSet rs = statement.executeQuery( sql );
			while( rs.next( ) ) {
				//int bookId = rs.getInt(1);
				int bookId = rs.getInt("book_id");
				//String subjectName = rs.getNString(2);
				String subjectName = rs.getNString("subject_name");
				//String bookName = rs.getString(3);
				String bookName = rs.getString("book_name");
				//String authorName = rs.getString(4);
				String authorName = rs.getString("author_name");
				//float price = rs.getFloat(5);
				float price = rs.getFloat("price");
				System.out.printf("%-5d%-15s%-60s%-30s%10.2f\n", bookId, subjectName, bookName, authorName, price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				//Step 5: Close resources
			try {
				if( statement != null )
					statement.close();
				if( connection != null )
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
