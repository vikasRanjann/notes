package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DBUtils;

public class BookDao implements Closeable {
	private Connection connection;
	private Statement statement;
	public BookDao() throws Exception{
		this.connection = DBUtils.getConnection();
		this.statement = this.connection.createStatement();
	}
	//Insert
	public int insert( Book book )throws Exception {
		String sql = "INSERT INTO BookTable Values("+book.getBookId()+",'"+book.getSubjectName()+"', '"+book.getBookName()+"', '"+book.getAuthorName()+"',"+book.getPrice()+")";	//DML
		return statement.executeUpdate(sql);
	}
	//Update
	public int update( int bookId, float pPrice )throws Exception {
		String sql = "UPDATE BookTable SET price=price - "+pPrice+" WHERE book_id="+bookId+"";	//DML
		return statement.executeUpdate(sql);
	}
	//Delete
	public int delete( int bookId ) throws Exception{
		String sql = "DELETE FROM BookTable WHERE book_id="+bookId+"";	//DML
		return statement.executeUpdate(sql);
	}
	//Find
	public Book find(int bookId) throws Exception{
		try( ResultSet rs = statement.executeQuery("SELECT * FROM BookTable WHERE book_id="+bookId+"");){
			if( rs.next())
				return new Book(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getFloat(5));
		}
		return null;
	}
	//Select
	public List<Book> getBooks( )throws Exception{
		List<Book> books = new ArrayList<>();
		try( ResultSet rs = statement.executeQuery("SELECT * FROM BookTable");){
			while( rs.next()) {
				Book book = new Book(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getFloat(5));
				books.add(book);
			}
		}
		return books;
	}
	@Override
	public void close() throws IOException {
		try {
			this.statement.close();
			this.connection.close();
		} catch (SQLException cause) {
			throw new IOException(cause);
		}
	}
}
