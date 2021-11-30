package ec.edu.ups.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.github.cdimascio.dotenv.Dotenv;

public class ContextJDBC {
	
	private static Dotenv dotenv = Dotenv.configure().directory("/ec/edu/ups/utils").load();
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/Hospital";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	/*
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = dotenv.get("URL");
	private static final String USER = dotenv.get("USER_DB");
	private static final String PASSWORD = dotenv.get("USER_PASSWORD");
	*/
	private Statement statement = null;
	private static ContextJDBC jdbc = null;
	
	public ContextJDBC() {
		this.connectDB();
	}
	
	public void connectDB() {
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			this.statement = connection.createStatement();
			System.out.println("Connection Successful");
		} catch (ClassNotFoundException e) {
			System.out.println("----WARNING.....problems with the driver\n" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("----WARNING.....problems with the BD\n" + e.getMessage());
		}		
	}
	
	public ResultSet query(String sql) {
		try {
			return this.statement.executeQuery(sql);
		} catch (SQLException e) { 
			System.out.println(">>>WARNING (JDBC:query): ---" + sql + "---" + e.getMessage());
		}
		return null;
	}
	
	public boolean update(String sql) {
		try {
			this.statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBC:update)... actualizacion: ---" + sql + "---" + e);
			return false;
		}
	}
	
	protected static ContextJDBC getContextJDBC() {
		if (jdbc == null) {
			jdbc = new ContextJDBC();
		}
		return jdbc;
	}

}
