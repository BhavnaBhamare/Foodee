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
import com.pojo.Addhotel;
import com.pojo.Registration;

/**
 * Servlet implementation class userdisplayservlet
 */
@WebServlet("/userdisplayservlet")
public class userdisplayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   BLmanger bl=new BLmanger();
   Registration r=new Registration();
    public userdisplayservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Registration>r=bl.searchreglist();
		HttpSession session=request.getSession();
		session.setAttribute("list", r);
		response.sendRedirect("adminuserdetail.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
