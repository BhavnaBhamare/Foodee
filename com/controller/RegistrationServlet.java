package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.model.BLmanger;
import com.pojo.Registration;
import com.pojo.Role;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   BLmanger bl=new BLmanger();
   Registration r=new Registration();
	Role ro=new Role();
    public RegistrationServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String rolltype=request.getParameter("rolltype");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		//String bdate=request.getParameter("bdate");
		String mobileno=request.getParameter("mobileno");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String address=request.getParameter("address");
		String areaname=request.getParameter("areaname");
		String city=request.getParameter("city");
		String pincode=request.getParameter("pincode");
		
		
		String bdate = request.getParameter("bdate");
	    DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
	    Date date = null;
	    try {
	        date = df.parse(bdate);
	    } catch (Exception e1) {
	        System.out.println("Exception occurred in parsing date : "+e1);
	    }
		 Role ro=bl.searchbyid(rolltype);
		 
		
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setGender(gender);
		r.setBdate(date);
		r.setMobileno(mobileno);
		r.setEmailid(emailid);
		r.setPassword(password);
		r.setConfirmpassword(confirmpassword);
		r.setAddress(address);
		r.setAreaname(areaname);
		r.setCity(city);
		r.setPincode(pincode);
		r.setRole(ro);
		bl.Register(r);
		response.sendRedirect("userhome.jsp");
		
		
	}

}
