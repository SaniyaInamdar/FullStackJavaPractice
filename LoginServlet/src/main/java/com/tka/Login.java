package com.tka;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Read form parameter
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "1234".equals(password)) {
        	//request.setAttribute("username", username);
            RequestDispatcher srd = request.getRequestDispatcher("success.jsp");
            srd.forward(request, response);
        }
        
        else {
        	RequestDispatcher erd = request.getRequestDispatcher("error.jsp");
        	erd.forward(request, response);
        }
    }
}
