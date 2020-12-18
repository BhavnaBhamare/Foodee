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
import com.pojo.Addtocart;
import com.pojo.Nvegbiryanees;
import com.pojo.Nvegchickenmaincourse;
import com.pojo.Nvegeggmaincourse;
import com.pojo.Nvegmenu;
import com.pojo.Nvegmuttonmaincourse;
import com.pojo.Nvegstarter;
import com.pojo.Registration;


@WebServlet("/addnonvegmenu")
public class addnonvegmenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
      BLmanger bl=new BLmanger();
      Nvegstarter st1=new Nvegstarter();
      Nvegeggmaincourse egg=new Nvegeggmaincourse();
      Nvegchickenmaincourse ch=new Nvegchickenmaincourse();
      Nvegmuttonmaincourse mu=new Nvegmuttonmaincourse();
      Nvegbiryanees bir=new Nvegbiryanees();
      Nvegmenu non=new Nvegmenu();
      Addtocart cart=new Addtocart();
    public addnonvegmenu() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nvegstartermenutype=request.getParameter("nvegstartermenutype");
		String p = request.getParameter("nstaterprize");
		int nstaterprize =Integer.parseInt(p);
		st1.setNvegstartermenutype(nvegstartermenutype);
		st1.setNstaterprize(nstaterprize);
		cart.setName(nvegstartermenutype);
		
		bl.savenvegstater(st1);
		
		String eggmenutype=request.getParameter("eggmenutype");
		String s = request.getParameter("eggprize");
		int eggprize =Integer.parseInt(s);
		egg.setEggmenutype(eggmenutype);
		egg.setEggprize(eggprize);
		bl.saaveegg(egg);
		
		String chickenmenutype=request.getParameter("chickenmenutype");
		String r = request.getParameter("chickenprize");
		int chickenprize =Integer.parseInt(r);
		ch.setChickenmenutype(chickenmenutype);
		ch.setChickenprize(chickenprize);
		bl.savechicken(ch);
		
		
		
		String muttonmenutype=request.getParameter("muttonmenutype");
		String s1 = request.getParameter("muttonprize");
		int muttonprize =Integer.parseInt(s1);
		mu.setMuttonmenutype(muttonmenutype);
		mu.setMuttonprize(muttonprize);
		bl.savemutton(mu);
		
		String biryaneemenutype=request.getParameter("biryaneemenutype");
		String s2 = request.getParameter("biryaneeprize");
		int biryaneeprize =Integer.parseInt(s2);
		bir.setBiryaneemenutype(biryaneemenutype);
		bir.setBiryaneeprize(biryaneeprize);
		bl.savebiryanee(bir);

		Nvegstarter st1=bl.seachnonstater(nvegstartermenutype);
		Nvegeggmaincourse egg=bl.sercheggbyid(eggmenutype);
		 Nvegchickenmaincourse ch=bl.searchchickenbyid(chickenmenutype);
		 Nvegmuttonmaincourse mu=bl.searchmuttonid(muttonmenutype);
		 Nvegbiryanees bir=bl.searchbirid(biryaneemenutype);
		 HttpSession session=request.getSession();
			String str1=(String) session.getAttribute("hotelname");
			Addhotel h1=bl.searchbyId(str1);
		 non.setNvegstarter(st1);
		 non.setNvegeggmaincourse(egg);
		 non.setNvegchickenmaincourse(ch);
		 non.setNvegmuttonmaincourse(mu);
		 non.setNvegbiryanees(bir);
		 non.setAddhotel(h1);
		 bl.savenonvegdata(non);
		 
	}

}
