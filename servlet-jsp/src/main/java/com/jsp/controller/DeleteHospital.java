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
@WebServlet("/deleteHospital")
public class DeleteHospital extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		
		
		HospitalService service=new HospitalService();
		Hospital hospital=service.deleteHospital(id);
		
		PrintWriter printWriter=resp.getWriter();
		
		if(hospital!=null) {
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("displayHospital");
			dispatcher.forward(req, resp);
			printWriter.println("Data deleted");
		}
		
	}

}
