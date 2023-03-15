package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
@WebServlet("/displayHospital")
public class DisplayHospital extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HospitalService service=new HospitalService();
		List<Hospital> list =service.GetAllHospital();
		
		if(list.size()>0) {
			req.setAttribute("hosptial", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayHospital.jsp");
			dispatcher.forward(req, resp);
			
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("createhospital.jsp");
			dispatcher.include(req, resp);
			
		}
	}

}
