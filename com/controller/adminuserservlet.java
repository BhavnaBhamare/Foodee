package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanger;
import com.pojo.Registration;
import com.pojo.Role;

/**
 * Servlet implementation class adminuserservlet
 */
@WebServlet("/adminuserservlet")
public class adminuserservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	Registration reg=new Registration();
	BLmanger bl=new BLmanger();
	Role ro=new Role();
	
    public adminuserservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "user";
		Role role2=bl.searchroleid2(user);
		List<Registration> r = bl.searchuser(role2);
		HttpSession session = request.getSession();
		session.setAttribute("list", r);

		response.sendRedirect("adminuserdetail.jsp");

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
