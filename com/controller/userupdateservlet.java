package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.model.BLmanger;
import com.pojo.Registration;

/**
 * Servlet implementation class userupdateservlet
 */
@WebServlet("/userupdateservlet")
public class userupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLmanger bl = new BLmanger();
	Registration r = new Registration();

	public userupdateservlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String emailid=request.getParameter("emailid");
		System.out.println(emailid);
		Registration r1 = bl.searchuserp(emailid);

		HttpSession session=request.getSession();
		session.setAttribute("list", r1);
		response.sendRedirect("usereditprofile.jsp");
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		HttpSession session=request.getSession();
		String emailid=request.getParameter("emailid");
		Registration r1 = bl.searchuserp(emailid);
		
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String bdate = request.getParameter("bdate");
		String mobileno = request.getParameter("mobileno");
		String email = request.getParameter("emailid");
		String address = request.getParameter("address");
		String areaname = request.getParameter("areaname");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = df.parse(bdate);
		} catch (Exception e1) {
			System.out.println("Exception occurred in parsing date : " + e1);
		}
		r.setRegid(r1.getRegid());
		r.setRole(r1.getRole());
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setGender(gender);
		r.setBdate(date);
		r.setMobileno(mobileno);
		r.setEmailid(email);
		r.setAddress(address);
		r.setAreaname(areaname);
		r.setPincode(pincode);
		r.setCity(city);
		r.setPassword(r1.getPassword());
		r.setConfirmpassword(r1.getConfirmpassword());
		
		
		bl.updateuserprofile(r);
		response.sendRedirect("userdisplayservlet1");
		
		
	}

}
