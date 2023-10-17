package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {
	public static final String URL = "jdbc:mysql://localhost:3306/cjonline_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement = connection.createStatement();
			
			//Step 1
			connection.setAutoCommit(false);
			
			String sqlUpdate1 = "UPDATE accounts SET balance = balance + 1000 WHERE acc_number=101";
			int count1 = statement.executeUpdate(sqlUpdate1);
			
			int x = 10, y = 2, z;
			x = x / y;	//OK
			
			String sqlUpdate2 = "UPDATE accounts SET balance = balance - 1000 WHERE acc_number=102";
			int count2 = statement.executeUpdate(sqlUpdate2);
			
			//Step 2
			connection.commit();
			
			if( count1 == 1 && count2 == 1 )
				System.out.println("Fund is transfered.");
			else
				System.out.println("Transaction failed");
		}
		catch( Exception ex ) {
			try {
				connection.rollback();
				ex.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
