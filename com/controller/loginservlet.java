package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanger;
import com.pojo.Addhotel;
import com.pojo.Registration;
import com.pojo.Role;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanger bl = new BLmanger();
	Registration ro = new Registration();
	 Addhotel h=new Addhotel();

	public loginservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		Registration ro = bl.searchbyrollid(emailid);

		if (ro.getRole().getRolltype().equals("user")) {
			boolean b = bl.searchemailpasswordforuser(emailid, password);
			if (b == true) {
				String firstname = ro.getFirstname();
				String email=ro.getEmailid();
				ServletContext session=request.getServletContext();
				session.setAttribute("firstname", firstname);
				session.setAttribute("email", email);
				response.sendRedirect("userhome.jsp");

			}
		} else {
			if (ro.getRole().getRolltype().equals("hotelowner")) {

				boolean b1 = bl.searchemailpasswordforhowner(emailid, password);
				if (b1 == true) {
					String firstname = ro.getFirstname();
					String email=ro.getEmailid();
					String hotelname=h.getHotelname();
				ServletContext session=request.getServletContext();
					session.setAttribute("firstname", firstname);
					session.setAttribute("email", email);
					session.setAttribute("hotelname", hotelname);
					response.sendRedirect("hotalownerhome.jsp");
				}
			}
		}
		if (ro.getRole().getRolltype().equals("admin")) {

			boolean b2 = bl.searchemailpasswordforadmin(emailid, password);
			if (b2 == true) {     
				String firstname = ro.getFirstname();
				HttpSession session = request.getSession(true);
				session.setAttribute("firstname", firstname);
				response.sendRedirect("adminhome.jsp");

			}
		}
	}

}
