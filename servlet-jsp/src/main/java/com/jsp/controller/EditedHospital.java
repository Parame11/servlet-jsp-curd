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

@WebServlet("/updatedHospital")
public class EditedHospital extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		long phone = Long.parseLong(req.getParameter("phone"));
		String website = req.getParameter("website");


        Hospital hospital =new Hospital();
        hospital.setId(id);
		hospital.setName(name);
		hospital.setPhone(phone);
		hospital.setWebsite(website);

		HospitalService service = new HospitalService();
		Hospital hospital2 = service.updateHospital(hospital);

		PrintWriter out = resp.getWriter();
		if(hospital2!=null) {
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("hospitalhome.jsp");
			dispatcher.forward(req, resp);
			out.println("Data Updated");
			
		}
	}

}
