package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	
	public static final String URL = "jdbc:mysql://localhost:3306/cjonline_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	public static void main(String[] args) {
		Class<Account> c = Account.class;
		String tableName = Program.getTableName( c );
		String columns = Program.getTableColumns( c );
		
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement = connection.createStatement();
			String sql = "CREATE TABLE "+tableName+" ("+columns+" );";
			int count =  statement.executeUpdate(sql);
			System.out.println("Table is created");
		}
		catch( Exception ex ) {
			ex.printStackTrace();
		}
		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static String getTableColumns(Class<Account> c) {
		StringBuilder sb = new StringBuilder();
		if( c != null ) {
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields) {
				Annotation[] annotations = field.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if( annotation instanceof Column )
					{
						Column column = (Column) annotation;
						sb.append(column.name()+" "+column.columnDefinition()+",");
					}
					if( annotation instanceof ID )
					{
						sb.deleteCharAt(sb.length()-1);
						sb.append(" PRIMARY KEY, ");
					}
				}
			}
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

	private static String getTableName(Class<Account> c) {
		if(  c != null ) {
			Annotation[] annotations = c.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				if( annotation instanceof Table )
				{
					Table table = (Table) annotation;
					return table.value();
				}
			}
		}
		return null;
	}
}
