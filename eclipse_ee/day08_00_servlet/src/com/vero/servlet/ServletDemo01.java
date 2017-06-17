package com.vero.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo01 implements Servlet {
	
	//实例化
	public ServletDemo01(){
		System.out.println("执行构造器");
	}
	//初始化
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("执行init()");
	}
	//服务
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("执行service()");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}
	
	//销毁
	@Override
	public void destroy() {
		System.out.println("执行destroy()");
	}
	
}
