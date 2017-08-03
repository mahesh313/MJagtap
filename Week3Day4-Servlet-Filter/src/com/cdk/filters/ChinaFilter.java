package com.cdk.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "ChinaFilter")
public class ChinaFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String ip = req.getRemoteAddr();
        if (ip.endsWith("0")) {
            resp.setContentType("text/html");
            resp.getWriter().write("<H1 style='color:red'>This service is not available in your area</H1>");
        }
        else{
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
