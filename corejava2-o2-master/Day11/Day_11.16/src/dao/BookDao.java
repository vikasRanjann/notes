package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pojo.Book;
import utils.DBUtils;

public class BookDao implements Closeable {
	private Connection connection;
	private CallableStatement stmtInsert, stmtUpdate, stmtDelete,stmtSelect, stmtFind;
	public BookDao() throws Exception{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareCall("{call sp_insert_book(?,?,?,?,?)}");
		this.stmtUpdate = this.connection.prepareCall("{call sp_update_book(?,?)}");
		this.stmtDelete = this.connection.prepareCall("{call sp_delete_book(?)}");
		this.stmtSelect = this.connection.prepareCall("{call sp_get_books()}");
		this.stmtFind = this.connection.prepareCall("{call sp_find_book(?)}");
	}
	//Insert
	public boolean insert( Book book )throws Exception {
		this.stmtInsert.setInt(1, book.getBookId());
		this.stmtInsert.setString(2, book.getSubjectName());
		this.stmtInsert.setString(3, book.getBookName());
		this.stmtInsert.setString(4, book.getAuthorName());
		this.stmtInsert.setFloat(5, book.getPrice());
		return this.stmtInsert.execute();
	}
	//Update
	public boolean update( int bookId, float price )throws Exception {
		this.stmtUpdate.setFloat(1, price);
		this.stmtUpdate.setInt(2, bookId);
		return this.stmtUpdate.execute();
	}
	//Delete
	public boolean delete( int bookId ) throws Exception{
		this.stmtDelete.setInt(1, bookId);
		return this.stmtDelete.execute();
	}
	//Find
	public Book find(int bookId) throws Exception{
		this.stmtFind.setInt(1, bookId);
		if( this.stmtFind.execute() )
		{
			try( ResultSet rs = this.stmtFind.getResultSet()){
				if( rs.next())
					return new Book(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getFloat(5));
			}
		}
		return null;
	}
	//Select
	public List<Book> getBooks( )throws Exception{
		List<Book> books = new ArrayList<>();
		if( this.stmtSelect.execute())
		{
			try( ResultSet rs = this.stmtSelect.getResultSet()){
				while( rs.next()) {
					Book book = new Book(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getFloat(5));
					books.add(book);
				}
			}
		}
		return books;
	}
	@Override
	public void close() throws IOException {
		try {
			this.stmtInsert.close();
			this.stmtUpdate.close();
			this.stmtDelete.close();
			this.stmtSelect.close();
			this.stmtFind.close();
			this.connection.close();
		} catch (SQLException cause) {
			throw new IOException(cause);
		}
	}
}
