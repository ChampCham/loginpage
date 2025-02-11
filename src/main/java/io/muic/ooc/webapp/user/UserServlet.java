package io.muic.ooc.webapp.user;

import io.muic.ooc.webapp.DBConnector;
import io.muic.ooc.webapp.Routable;
import io.muic.ooc.webapp.entity.User;
import io.muic.ooc.webapp.service.SecurityService;
import io.muic.ooc.webapp.service.UserService;
import org.apache.commons.text.CaseUtils;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet implements Routable {
    private static UserServlet userServlet = null;

    private SecurityService securityService;
    private UserService userService;

    private UserServlet(){
        this.securityService = SecurityService.getInstance();
        this.userService = UserService.getInstance();
    }

    public static UserServlet getInstance(){
        if (userServlet == null)
        {
            //synchronized block to remove overhead
            synchronized (UserServlet.class)
            {
                if(userServlet==null)
                {
                    // if instance is null, initialize
                    userServlet = new UserServlet();
                }
            }
        }
        return userServlet;
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean authorized = securityService.isAuthorized(request);
        if (authorized) {
            try{
                String username = (String) request.getSession().getAttribute("username");
                request.setAttribute("username", username);
                User user = userService.get(username);
                request.setAttribute("user", user);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user.jsp");
                rd.include(request, response);
            } catch(SQLException e){
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("/login");
        }
    }

    @Override
    public String getMapping() {
        return "/user";
    }
}
