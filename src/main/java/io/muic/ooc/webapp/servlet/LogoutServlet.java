package io.muic.ooc.webapp.servlet;


import io.muic.ooc.webapp.Routable;
import io.muic.ooc.webapp.service.SecurityService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet implements Routable {

    private static LogoutServlet logoutServlet = null;

    private SecurityService securityService;

    private LogoutServlet(){
        this.securityService = SecurityService.getInstance();
    }

    public static LogoutServlet getInstance(){
        if (logoutServlet == null)
        {
            //synchronized block to remove overhead
            synchronized (LogoutServlet.class)
            {
                if(logoutServlet==null)
                {
                    // if instance is null, initialize
                    logoutServlet = new LogoutServlet();
                }
            }
        }
        return logoutServlet;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean authorized = securityService.isAuthorized(request);
        if(authorized)
            securityService.logout(request);
        response.sendRedirect("/login");
    }

    @Override
    public String getMapping() {
        return "/logout";
    }
}
