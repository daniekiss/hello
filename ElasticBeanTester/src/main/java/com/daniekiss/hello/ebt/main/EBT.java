package com.daniekiss.hello.ebt.main;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EBT extends HttpServlet{

	private static final long serialVersionUID = -4169980837130701492L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Calendar c = Calendar.getInstance();
		
		resp.setContentType("text/html;charset=utf-8");
        resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().print("Hello World!\n<br />-- " + c.getTimeZone().toZoneId() + ": " +  c.getTime());
	}
	
}
