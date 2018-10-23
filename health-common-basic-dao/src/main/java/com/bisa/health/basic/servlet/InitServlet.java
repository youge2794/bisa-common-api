package com.bisa.health.basic.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.bisa.health.basic.context.BeanFactoryContext;


public class InitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static WebApplicationContext wc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        wc = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        BeanFactoryContext.setWc(wc);

    }

    public static WebApplicationContext getWc() {
        return wc;
    }

}
