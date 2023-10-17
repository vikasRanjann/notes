package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
			DatabaseMetaData dmd = connection.getMetaData( );
			//System.out.println(dmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)); //false
			//System.out.println(dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)); //true
			//System.out.println(dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)); //false
			
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)); //true
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)); //true
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)); //false
			
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)); //true
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)); //true
			//System.out.println(dmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)); //false
			
			//System.out.println(dmd.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT)); //false
			System.out.println(dmd.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT)); //true
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}finally {
			
		}
	}
}
