package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
@WebServlet("/HospitalLogin")
public class HospitalLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		
		
		
		PrintWriter  out=resp.getWriter();
     
		HospitalService service=new HospitalService();
		Hospital hospital2=service.hospitalLogin(name, phone);
		
		if(hospital2!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("hospitalhome.jsp");
			dispatcher.forward(req, resp);
		}else {
			out.println("<html><body><center><h1> Invalid User </h1></center></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("LoginForm.jsp");
			dispatcher.include(req, resp);
		}
		
		
	}

}
