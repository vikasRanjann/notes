package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		CallableStatement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "{call sp_insert_book(?,?,?,?,?)}";	//TODO
			statement = connection.prepareCall(sql);
			
			statement.setInt(1, 1026 );
			statement.setString(2, "OS" );
			statement.setString(3, "OS Concept's" );
			statement.setString(4, "Galvin" );
			statement.setFloat(5, 450 );
			
			if(!statement.execute())
				System.out.println(statement.getUpdateCount()+" record inserted.");
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

