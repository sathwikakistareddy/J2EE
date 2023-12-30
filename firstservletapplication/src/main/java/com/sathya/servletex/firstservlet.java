package com.sathya.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter writer=response.getWriter();
		writer.println("This is first servlet");
		writer.println("adv java by ratan sir");
		writer.println(" The class is good");
		writer.println("ratan sir is hero");

		

    }
	}
