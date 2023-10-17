package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import pojo.Book;
import utils.DBUtils;

public class Program {
	public static String[] getQueries( )
	{
		String[] arr = new String[ 3 ];
		arr[ 0 ] = "INSERT INTO BookTable Values(1026,'AAA','ABC','BBB',450)";
		arr[ 1 ] = "INSERT INTO BookTable Values(1027,'AAA','PQR','CCC',550)";
		arr[ 2 ] = "INSERT INTO BookTable Values(1028,'AAA','XYZ','DDD',650)";
		return arr;
	}
	public static void main(String[] args) 
	{
		try( Connection connection = DBUtils.getConnection();
			 Statement statement = connection.createStatement();)
		{
			String[] queries = Program.getQueries();
			for( String query : queries )
				statement.addBatch(query);
			int[] count = statement.executeBatch();
			System.out.println(count.length+"	"+Arrays.toString(count));
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
	public static void main4(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();){
			String sql = "DELETE FROM BookTable WHERE book_id=1026";	//DML
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record updated");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();){
			String sql = "UPDATE BookTable SET price=price - 500 WHERE book_id=1026";	//DML
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record updated");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();){
			String sql = "INSERT INTO BookTable Values(1026,'OS', 'Linux Programming Interface', 'Michael Kerrisk',5000)";	//DML
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record updated");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();){
			String sql = "SELECT * FROM BookTable";	//DQL
			try( ResultSet rs = statement.executeQuery(sql);){
				while( rs.next()) {
					Book book = new Book(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getFloat(5));
					System.out.println(book.toString());
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
