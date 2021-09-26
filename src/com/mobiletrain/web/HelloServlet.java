package com.mobiletrain.web;

import javax.servlet.HttpServlet;


public class HelloServlet implement HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		this.doGet(request,response);
	}
}	