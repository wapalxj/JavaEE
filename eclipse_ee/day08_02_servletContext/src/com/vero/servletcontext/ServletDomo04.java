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
 * 获取资源路径
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
	//获取a.properties
	private void test1() throws FileNotFoundException, IOException{
		//参数一定要以/开头,路径参照的是部署后的路径
		String path=getServletContext().getRealPath("/WEB-INF/a.properties");
		//创建一个Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
	}
	//获取b.properties
	private void test2() throws FileNotFoundException, IOException{
		//参数一定要以/开头,路径参照的是部署后的路径
		String path=getServletContext().getRealPath("/WEB-INF/classes/b.properties");
		//创建一个Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
	}

	//获取c.properties
	private void test3() throws FileNotFoundException, IOException{
		//参数一定要以/开头,路径参照的是部署后的路径
		String path=getServletContext().
				getRealPath("/WEB-INF/classes/com/vero/servletcontext/c.properties");
		//创建一个Properties
		Properties properties=new Properties();
		properties.load(new FileInputStream(path));
		System.out.println(properties.getProperty("key"));
		
	}
}
