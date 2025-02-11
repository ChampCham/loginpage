package io.muic.ooc.webapp.user;

import io.muic.ooc.webapp.Routable;
import io.muic.ooc.webapp.entity.User;
import io.muic.ooc.webapp.service.SecurityService;
import io.muic.ooc.webapp.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UsersServlet extends HttpServlet implements Routable {
    private static UsersServlet usersServlet;

    private SecurityService securityService;
    private UserService userService;

    private UsersServlet(){
        this.securityService = SecurityService.getInstance();
        this.userService = UserService.getInstance();
    }

    public static UsersServlet getInstance(){
        if (usersServlet == null)
        {
            //synchronized block to remove overhead
            synchronized (UsersServlet.class)
            {
                if(usersServlet==null)
                {
                    // if instance is null, initialize
                    usersServlet = new UsersServlet();
                }
            }
        }
        return usersServlet;
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean authorized = securityService.isAuthorized(request);
        if(authorized){
            try{
                String username = (String) request.getSession().getAttribute("username");
                List<User> users = userService.getUsers();
                request.setAttribute("users", users);
                request.setAttribute("username", username);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/users.jsp");
                rd.include(request, response);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        else{
            response.sendRedirect("/login");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean authorized = securityService.isAuthorized(request);
        if(authorized){
            try{
                String username = request.getParameter("username");
                userService.remove(username);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        else{
            response.sendRedirect("/login");
        }
    }

    @Override
    public String getMapping() {
        return "/users";
    }
}
