package com.cdk.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements javax.servlet.Filter{
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        HttpSession session = ((HttpServletRequest)req).getSession();
        if ((Boolean)session.getAttribute("Login-Status")) {
            chain.doFilter(req, resp);
        }
        else {
            resp.setContentType("text/html");
            resp.getWriter().write("<H1 style = 'color:red'>You have to first login to access this page</H1>");
            resp.getWriter().write("<br><a href=\"login.html\">Login here</a>");
        }
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {


    }

}
