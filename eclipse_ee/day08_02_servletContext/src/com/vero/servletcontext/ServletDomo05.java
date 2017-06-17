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
 * ServletContext��Servlet����ת��
 */
@WebServlet("/ServletDomo05")
public class ServletDomo05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��Ҫ����");
		System.out.println("������Ұ첻�ˣ��ҿ������˰���");
		ServletContext servletContext=getServletContext();
		RequestDispatcher dispatcher=
				servletContext.getRequestDispatcher("/ServletDomo06");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
