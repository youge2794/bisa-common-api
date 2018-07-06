package com.bisa.health.basic.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.springframework.web.context.WebApplicationContext;

public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static WebApplicationContext wc;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

	}

	public static WebApplicationContext getWc() {
		return wc;
	}

}
