package test;
import java.sql.*;
import utils.DBUtils;
public class Program {
	public static void main(String[] args) {
		try( Connection connection = DBUtils.getConnection();
			 Statement statement = connection.createStatement( ); ) {
			String sql = "SELECT book_id, subject_name, book_name, author_name, price FROM BookTable";
			ResultSet rs = statement.executeQuery( sql );
			while( rs.next( ) ) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getNString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");
				System.out.printf("%-5d%-15s%-60s%-30s%10.2f\n", bookId, subjectName, bookName, authorName, price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
