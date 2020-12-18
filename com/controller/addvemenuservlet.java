package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanger;
import com.pojo.Addhotel;
import com.pojo.Roti;
import com.pojo.Sweets;
import com.pojo.Vegmenu;
import com.pojo.Vegrice;
import com.pojo.Vegsabji;
import com.pojo.Vegstarter;

@WebServlet("/addvemenuservlet")
public class addvemenuservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Vegstarter st = new Vegstarter();
	Roti rt = new Roti();
	Vegsabji sb = new Vegsabji();
	Vegrice ri = new Vegrice();
	Sweets sw = new Sweets();
	BLmanger bl = new BLmanger();
	Vegmenu ve = new Vegmenu();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addvemenuservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		HttpSession session = request.getSession();
		String str1 = (String) session.getAttribute("hotelname");
		Addhotel h1 = bl.searchbyId(str1);

		String vegstatermenutype = request.getParameter("vegstatermenutype");

		String p = request.getParameter("staterprize");
		int staterprize = Integer.parseInt(p);
		st.setVegstatermenutype(vegstatermenutype);
		st.setStaterprize(staterprize);
		bl.savevegstater(st);

		String roticategory = request.getParameter("roticategory");
		String r = request.getParameter("rotiprize");
		int rotiprize = Integer.parseInt(r);
		rt.setRoticategory(roticategory);
		rt.setRotiprize(rotiprize);
		bl.saveveroti(rt);

		String sabjimenutype = request.getParameter("sabjimenutype");
		String s = request.getParameter("sabjiprize");
		int sabjiprize = Integer.parseInt(s);
		sb.setSabjimenutype(sabjimenutype);
		sb.setSabjiprize(sabjiprize);
		bl.savesabji(sb);

		String vegmenutype = request.getParameter("vegmenutype");
		String s1 = request.getParameter("riceprize");
		int riceprize = Integer.parseInt(s1);
		ri.setVegmenutype(vegmenutype);
		ri.setRiceprize(riceprize);
		bl.saveverice(ri);

		String sweetmenutype = request.getParameter("sweetmenutype");
		String s2 = request.getParameter("rotiprize");
		int sweetprize = Integer.parseInt(s2);
		sw.setSweetmenutype(sweetmenutype);
		sw.setSweetprize(sweetprize);
		
		bl.savesweet(sw);

		response.sendRedirect("nonvegmenu.jsp");
		session = request.getSession();

		Vegstarter st = bl.searchvegstarterid(vegstatermenutype);
		Vegrice rice = bl.searchvegricebyid(vegmenutype);
		Vegsabji sb = bl.searchvegsbjibyid(sabjimenutype);
		Roti rt = bl.searchrotibyid(roticategory);
		Sweets sw = bl.searchsweetbyid(sweetmenutype);
		// Roti vrt=bl.searchvegrotiid(roticategory);

		ve.setVegstarter(st);
		ve.setVegrice(ri);
		ve.setVegsabji(sb);
		ve.setRoti(rt);
		ve.setSweets(sw);
		ve.setAddhotel(h1);

		bl.savevegmenu(ve);

	}

}
