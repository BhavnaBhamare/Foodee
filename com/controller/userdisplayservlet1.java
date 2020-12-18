package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanger;
import com.pojo.Registration;

/**
 * Servlet implementation class userdisplayservlet1
 */
@WebServlet("/userdisplayservlet1")
public class userdisplayservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanger bl = new BLmanger();
	Registration r = new Registration();
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userdisplayservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext session=request.getServletContext();
		String emailid=(String) session.getAttribute("email");
		Registration r1 = bl.searchuserp(emailid);

		
		session.setAttribute("fnm", r1);
		response.sendRedirect("userpro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
