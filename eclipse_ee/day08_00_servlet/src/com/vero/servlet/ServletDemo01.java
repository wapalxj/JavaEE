package com.vero.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo01 implements Servlet {
	
	//ʵ����
	public ServletDemo01(){
		System.out.println("ִ�й�����");
	}
	//��ʼ��
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("ִ��init()");
	}
	//����
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("ִ��service()");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}
	
	//����
	@Override
	public void destroy() {
		System.out.println("ִ��destroy()");
	}
	
}
