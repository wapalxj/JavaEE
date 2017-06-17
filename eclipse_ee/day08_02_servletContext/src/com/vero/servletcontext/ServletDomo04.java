package com.vero.servletcontext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDomo04
 * 
 * http://localhost:8080/day08_02_servletContext/ServletDomo04
 * ��ȡ��Դ·��
 * 
 * 
 */

@WebServlet("/ServletDomo04")
public class ServletDomo04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test3();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	//��ȡa.properties
	private void test1() throws FileNotFoundException, IOException{
		//����һ��Ҫ��/��ͷ,·�����յ��ǲ�����·��
		String path=getServletContext().getRealPath("/WEB-INF/a.properties");
		//����һ��Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
	}
	//��ȡb.properties
	private void test2() throws FileNotFoundException, IOException{
		//����һ��Ҫ��/��ͷ,·�����յ��ǲ�����·��
		String path=getServletContext().getRealPath("/WEB-INF/classes/b.properties");
		//����һ��Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
	}

	//��ȡc.properties
	private void test3() throws FileNotFoundException, IOException{
		//����һ��Ҫ��/��ͷ,·�����յ��ǲ�����·��
		String path=getServletContext().
				getRealPath("/WEB-INF/classes/com/vero/servletcontext/c.properties");
		//����һ��Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
		
	}
}
