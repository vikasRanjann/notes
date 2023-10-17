package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Program {
	public static final String URL = "jdbc:mysql://localhost:3306/cjonline_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	public static void main(String[] args) {
		String sql = "{call sp_fund_transfer(?,?,?,?,?)}";
		try( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 CallableStatement statement = connection.prepareCall(sql); ){
			statement.setInt(1, 101);
			statement.setInt(2, 102);
			statement.setFloat(3, 2000);
			statement.registerOutParameter(4, Types.FLOAT);
			statement.registerOutParameter(5, Types.FLOAT);
			statement.execute();
			System.out.println("Source Balance	:	"+statement.getFloat(4));
			System.out.println("Destination Balance	:	"+statement.getFloat(5));
		}
		catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
