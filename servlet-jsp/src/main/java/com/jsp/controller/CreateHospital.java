package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

@WebServlet("/createHospital")
public class CreateHospital  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



	String name =req.getParameter("name");
	long phone =Long.parseLong(req.getParameter("phone"));
	String website = req.getParameter("website");
	
	Hospital hospital=new Hospital();
	
	hospital.setName(name);
	hospital.setPhone(phone);
	hospital.setWebsite(website);
	
	HospitalService service=new HospitalService();
	
	Hospital hospital2=service.saveHospital(hospital);
	
//	PrintWriter printWriter=resp.getWriter();
	
	if(hospital2!=null) {
		RequestDispatcher dispatcher=req.getRequestDispatcher("");
		dispatcher.forward(req, resp);
		
//		printWriter.println("Data Saved");
		
	}else {
		RequestDispatcher dispatcher=req.getRequestDispatcher("createhosiptal.jsp");
		dispatcher.include(req, resp);
//		printWriter.println("Data is not Saved");
	}
		
	}

}
