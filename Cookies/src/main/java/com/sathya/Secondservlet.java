package com.sathya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //get the requested data 
        String qualification = request.getParameter("qualification");
        String designition =request.getParameter("designition");
        
        //create the cookie Object 
        Cookie cookie3=new Cookie("qualification",qualification);
        Cookie cookie4=new Cookie("designition",designition);
        
        //Place the data into response object 
        response.addCookie(cookie3);
        response.addCookie(cookie4);
        
        //forward the request to next form 
        RequestDispatcher dispatcher = request.getRequestDispatcher("Form3.html");
        dispatcher.forward(request, response);
      }
    
}