package com.sathya.userregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

    public class UserDao {
		 public int saveUser(User user) { 
		  int result=0; 
		 //get the connection 
		  try(Connection connection=DBConnectionUtils.createConnection()) 
		  { 
		   PreparedStatement  preparedStatement= connection.prepareStatement("insert into user_table values(?,?,?,?,?)"); 
		   preparedStatement.setString(1, user.getUserId()); 
		   preparedStatement.setString(2, user.getUserName()); 
		   preparedStatement.setString(3, user.getUserEmail()); 
		   preparedStatement.setString(4, user.getUserMobile()); 
		   preparedStatement.setString(5, user.getUserLocation()); 
		   result= preparedStatement.executeUpdate(); 
		  } 
		  catch (SQLException e) { 
		   // TODO Auto-generated catch block 
		   e.printStackTrace(); 
		  } 
		  return result; 
		 } 
		 public User findById(String userId) 
		 { 
		  User user = null;  
		  try(Connection connection = DBConnectionUtils.createConnection()) 
		  { 
		   PreparedStatement preparedStatement = connection.prepareStatement("select * from user_table where userId=?"); 
		   preparedStatement.setString(1, userId); 
		   ResultSet resultSet = preparedStatement.executeQuery(); 
		    
		   if(resultSet.next()) 
		   { user = new User(); 
		    user.setUserId(resultSet.getString(1)); 
		    user.setUserName(resultSet.getString(2)); 
		    user.setUserEmail(resultSet.getString(3)); 
		    user.setUserMobile(resultSet.getString(4)); 
		    user.setUserLocation(resultSet.getString(5)); 
		   } 
		  } 
		  catch (SQLException e) { 
		   e.printStackTrace(); 
		  } 
		  return user; 
		 } 
		 public User findByDetails(String userId,String userEmail) 
		  { 
		   User user =null; 
		   try(Connection connection = DBConnectionUtils.createConnection()) 
		   { 
		    PreparedStatement preparedStatement = connection.prepareStatement("select * from user_table where userId=? and userEmail=?"); 
		    preparedStatement.setString(1, userId); 
		    preparedStatement.setString(2, userEmail); 
		   //execute the query.  
		    ResultSet resultSet = preparedStatement.executeQuery(); 
		    if(resultSet.next()) 
		    { //read the data from ResultSer & setting to product 
		     user = new User(); 
		     user.setUserId(resultSet.getString(1)); 
		     user.setUserName(resultSet.getString(2)); 
		     user.setUserEmail(resultSet.getString(3)); 
		     user.setUserMobile(resultSet.getString(4)); 
		     user.setUserLocation(resultSet.getString(5)); 
		    } 
		   } 
		   catch(SQLException e) 
		   { e.printStackTrace(); 
		   } 
		   return user; 
		  } 
		 public List<User>findAll() 
		 { 
		  List<User>users=new ArrayList<User>(); 
		  try(Connection connection=DBConnectionUtils.createConnection()) 
		  { 
		   Statement statement=connection.createStatement(); 
		   ResultSet resultSet=statement.executeQuery("select * from user_table"); 
		   while(resultSet.next()) 
		   { 
		    User user= new User(); 
		    user.setUserId(resultSet.getString(1)); 
		    user.setUserName(resultSet.getString(2)); 
		    user.setUserEmail(resultSet.getString(3)); 
		    user.setUserMobile(resultSet.getString(4)); 
		    user.setUserLocation(resultSet.getString(5)); 
		    users.add(user); 
		   } 
		  } 
		  catch (SQLException e) { 
		   // TODO: handle exception 
		   e.printStackTrace(); 
		  } 
		  return users; 
		   
		 } 
		 
		}
		

