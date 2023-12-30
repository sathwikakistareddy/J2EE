package com.sathya.userregistration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/loginServlet")
	public class loginServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String userId=request.getParameter("userId");
	  String userEmail=request.getParameter("userEmail");
	  int result=0;
	  if(userId.equalsIgnoreCase("ratan") && userEmail.equals("ratan@12"))
	  {result=1;
	  }
	  request.setAttribute("saveResult", result);
	  
	  RequestDispatcher dispatcher=request.getRequestDispatcher("savelogin.jsp");
	  dispatcher.forward(request, response);
	 }
	}



