package com.jsp.service;

import java.util.List;

import com.jsp.dao.HospitalDaoImpl;
import com.jsp.dto.Hospital;

public class HospitalService {
	
	HospitalDaoImpl dao= new HospitalDaoImpl();
	
	public Hospital saveHospital(Hospital hospital) {
		return dao.saveHospital(hospital);
	}
	
	public Hospital updateHospital(Hospital hospital) {
		return dao.updateHospital(hospital);
	}
	
	public Hospital deleteHospital(int id) {
		return dao.deleteHospital(id);
	}
	
	public Hospital getHospitalById(int id) {
		return dao.getHospitalById(id);
		
	}
	
	public List<Hospital> GetAllHospital() {
		return dao.GetAllHospital();
		
	}
	
	public Hospital hospitalLogin(String name, long phone){
		return dao.HospitalLogin(name, phone);
	}

}
