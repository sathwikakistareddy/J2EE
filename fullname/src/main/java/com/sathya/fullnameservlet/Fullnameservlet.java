package com.sathya.fullnameservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Fullnameservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the client request data
		String firstname=request.getParameter("Firstname");
		String lastname=request.getParameter("lastname");
		//process the data
		String fullname;
		fullname=firstname+" " +lastname;
		//render the response to browser
		response.setContentType("text/plain");
		PrintWriter writer=response.getWriter();
		writer.println("your full Name..."+fullname);

		
		
	}

}
