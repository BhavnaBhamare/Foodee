package com.controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanger;
import com.pojo.Vegstarter;


@WebServlet("/vemenudisplayservlet")
public class vemenudisplayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BLmanger bl=new BLmanger();
    Vegstarter st=new Vegstarter();
    public vemenudisplayservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Vegstarter>stud=bl.searchlist();
		HttpSession session=request.getSession();
		session.setAttribute("list", stud);
		response.sendRedirect("addtocart.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
