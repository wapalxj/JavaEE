package com.vero.servletcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDomo01
 * 
 * http://localhost:8080/day08_02_servletContext/context
 * 
 * ServletContext作为域对象设置数据
 */
@WebServlet("/ServletDomo01")
public class ServletDomo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过调用GenericServlet的getServletContext()
		ServletContext application=getServletContext();
		application.setAttribute("name", "vero");
		System.out.println(application.getClass().getName());
		
		response.getWriter().append("ServletDomo01 ");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
