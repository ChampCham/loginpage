/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.webapp.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import io.muic.ooc.webapp.entity.User;
import org.apache.commons.lang.StringUtils;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author gigadot
 */
public class SecurityService {

    private static SecurityService securityService;

    private UserService userService;

    private SecurityService(){
        this.userService = UserService.getInstance();
    }

    public static SecurityService getInstance(){
        if (securityService == null)
        {
            //synchronized block to remove overhead
            synchronized (SecurityService.class)
            {
                if(securityService==null)
                {
                    // if instance is null, initialize
                    securityService = new SecurityService();
                }
            }
        }
        return securityService;
    }

    public boolean isAuthorized(HttpServletRequest request) {
        try{
            String username = (String) request.getSession()
                    .getAttribute("username");
            return (username != null && userService.containsUser(username));
        }catch (SQLException e){
            return false;
        }
    }

    public boolean authenticate(String username, String password, HttpServletRequest request) {
        try{
            User user = userService.get(username);
            if(user == null){
                return false;
            }
            boolean isMatched = BCrypt.checkpw(password, user.getPassword());
            if (isMatched) {
                request.getSession().setAttribute("username", username);
                return true;
            } else {
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    public void logout(HttpServletRequest request) {
        request.getSession().invalidate();
    }
    
}
