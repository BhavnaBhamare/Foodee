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
import com.pojo.Nvegmenu;
import com.pojo.Vegmenu;
import com.pojo.Vegstarter;

/**
 * Servlet implementation class menudisplayservlet
 */
@WebServlet("/menudisplayservlet")
public class menudisplayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   BLmanger bl=new BLmanger();
   Vegmenu veg=new Vegmenu();
   Vegstarter str=new Vegstarter();
   Nvegmenu nonveg=new Nvegmenu();
  Addhotel hotel=new Addhotel(); 
    public menudisplayservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String hotelname= request.getParameter("hotelname");
		System.out.println(hotelname);
		Addhotel h=bl.searchhotel(hotelname);
		
		List<Vegmenu> veg=bl.searchvegmenu(h);
		HttpSession session=request.getSession();
		session.setAttribute("list", veg);
		List<Nvegmenu> nonveg=bl.searchnonvegmenu(h);
		session=request.getSession();
		session.setAttribute("list1", nonveg);
		response.sendRedirect("addtocart.jsp");
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
