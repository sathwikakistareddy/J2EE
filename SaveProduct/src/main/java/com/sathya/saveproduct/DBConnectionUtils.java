package com.sathya.saveproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {
    	 public static Connection createConnection()  
				 { 
				  Connection connection=null; 
				  try { 
				   Class.forName("oracle.jdbc.driver.OracleDriver"); 
				   connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager"); 
				  } catch (ClassNotFoundException| SQLException e) { 
				   e.printStackTrace(); 
				  } 
				  return connection; 
				   
				   
	}

}
