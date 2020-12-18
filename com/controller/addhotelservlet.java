package com.controller;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
import com.model.BLmanger;
import com.pojo.Addhotel;
import com.pojo.Registration;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 500)
@WebServlet("/addhotelservlet")
public class addhotelservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
   BLmanger bl=new BLmanger();
   Addhotel h=new Addhotel();
    public addhotelservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	//PrintWriter out=response.getWriter();
	String hotelname=request.getParameter("hotelname");
	String hoteladdress=request.getParameter("hoteladdress");
	String hotelphoneno=request.getParameter("hotelphoneno");
	Part img1=request.getPart("hotelimg");
	InputStream is=null;
	is=img1.getInputStream();
	byte[] hotelimg=IOUtils.toByteArray(is);
	String hotelemail=request.getParameter("hotelemail");
	
	String services = "";
    String a[]=request.getParameterValues("services");
    for(int i=0;i<a.length;i++){
    	services+=a[i]+"";
    }
	String paymentmethod=request.getParameter("paymentmethod");
	String hoteltimefrm=request.getParameter("hoteltimefrm");
	String hoteltimeto=request.getParameter("hoteltimeto");
	String hoteldays = "";
    String b[]=request.getParameterValues("hoteldays");
    for(int i=0;i<b.length;i++){
    	hoteldays+=b[i]+"";
    }
    
	HttpSession session=request.getSession();
	String str=(String) session.getAttribute("firstname");

	Registration r2=bl.searchId(str);	
	h.setHotelname(hotelname);
	h.setHoteladdress(hoteladdress);
	h.setHotelphoneno(hotelphoneno);
	h.setHotelimg(hotelimg);
	h.setHotelemail(hotelemail);
	h.setServices(services);
	h.setPaymentmethod(paymentmethod);
	h.setHoteltimefrm(hoteltimefrm);
	h.setHoteltimeto(hoteltimeto);
	h.setHoteldays(hoteldays);
	h.setRegistration(r2);
	bl.hoteldays(h);

	session = request.getSession(true);
	session.setAttribute("hotelname", hotelname);
	response.sendRedirect("hotalownerhome.jsp");
	
	}

}
