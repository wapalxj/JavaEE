package com.vero.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo5
 * ÿ��һ��ˢ��һ��
 * http://localhost:8080/day09_00_httpServletResponse/ServletDemo5
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ÿ��һ��ˢ��һ��
		response.setContentType("text/html;charset=UTF-8");
//		response.setIntHeader("refresh", 1);
//		Random r=new Random();
//		response.getWriter().write(r.nextInt()%10+"");
		
		response.setHeader("refresh", "3,url=/day09_00_httpServletResponse/demo6");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}