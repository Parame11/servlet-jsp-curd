package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
@WebServlet("/editHospital")
public class UpdateHospital extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		
//		String name=req.getParameter("name");
//		long phone=Long.parseLong(req.getParameter("phone"));
//		String website =req.getParameter("website");
//		
//		Hospital hospital=new Hospital();
//		hospital.setName(name);
//		hospital.setPhone(phone);
//		hospital.setWebsite(website);
		
		
		HospitalService service=new HospitalService();
		Hospital hospital=service.getHospitalById(id);
		
		HttpSession session=req.getSession();
		
		PrintWriter printWriter=resp.getWriter();
		
		if(hospital!=null) {
			session.setAttribute("hospitals", hospital);
				RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateHospital.jsp");
			dispatcher.forward(req, resp);
			
			printWriter.println("Data is updated");
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("displayHospital");
			dispatcher.include(req, resp);
		}
	}

}
