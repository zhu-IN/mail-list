package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	//////////////////////
	////////////////////
	//////////////////
	public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER_NAME = "root";
	public static final String DB_PASSWORD = "1234";
	/////////////////
	//////////////////
	///////////////////
	
	private Connection connection = null;
	
	public DatabaseConnection(){
		try
		{
			Class.forName(DB_DRIVER);
			this.connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASSWORD);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
			System.out.println("SQLÓï¾ä´íÎó£¡");
		}
		catch (ClassNotFoundException ex) 
		{
			ex.printStackTrace();
			System.out.println("Î´ÕÒµ½Çý¶¯£¡");
		}
	}
		
		public Connection getConnection(){
			return this.connection;
		}
		
		public void close(){
			if(this.connection != null)
			{
				try
				{
					this.connection.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		
}
