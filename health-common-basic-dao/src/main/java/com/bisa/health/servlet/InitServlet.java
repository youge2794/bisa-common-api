package com.bisa.health.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import com.google.gson.Gson;

public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static WebApplicationContext wc;
	private final Gson gson=new Gson();

	private static final Logger log = LogManager.getLogger(InitServlet.class);
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

	}

	public static WebApplicationContext getWc() {
		return wc;
	}

}
