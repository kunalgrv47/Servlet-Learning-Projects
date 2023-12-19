package com.login.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myEmail = req.getParameter("email");
		String myPassword = req.getParameter("password");
		
		if(myEmail.equals("kunalgrv47@gmail.com") && myPassword.equals("1234")) {
			HttpSession session = req.getSession();
			session.setAttribute("name_key","Kunal");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}else {
			resp.getWriter().append("Login Unsuccessful");
		}
	}
}
