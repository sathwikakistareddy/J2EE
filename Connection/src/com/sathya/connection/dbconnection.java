package com.sathya.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Connection connection=DriverManager.getconnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
    System.out.println("connection created succesfully");
    connection.close();
    System.out.println("connection closed succesfully");
    
	}

}
