package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import utils.DBUtils;

//Step 0 : include db connector into classpath/build path
public class Program {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DBUtils.getConnection();
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
