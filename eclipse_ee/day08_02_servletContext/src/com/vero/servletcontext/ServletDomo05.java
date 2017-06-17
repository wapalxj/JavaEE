package com.vero.servletcontext;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDomo05
 * 
 * http://localhost:8080/day08_02_servletContext/ServletDomo05
 * 
 * ServletContext对Servlet请求转发
 */
@WebServlet("/ServletDomo05")
public class ServletDomo05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我要办事");
		System.out.println("你的事我办不了，我可以找人帮你");
		ServletContext servletContext=getServletContext();
		RequestDispatcher dispatcher=
				servletContext.getRequestDispatcher("/ServletDomo06");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
