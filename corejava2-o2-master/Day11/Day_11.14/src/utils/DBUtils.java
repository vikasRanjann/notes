package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils {
	static Properties p;
	static {
		try {
			p = new Properties();
			p.load(new FileInputStream(new File("Config.properties")));
			Class.forName(p.getProperty("DRIVER"));
		} catch (ClassNotFoundException | IOException cause) {
			throw new RuntimeException(cause);
		}
	}
	public static Connection getConnection( )throws Exception{
		return DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));
	}
}
