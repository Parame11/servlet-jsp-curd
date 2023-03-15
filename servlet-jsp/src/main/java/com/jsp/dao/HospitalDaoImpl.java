package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Hospital;

public class HospitalDaoImpl {
	
	public Hospital saveHospital(Hospital hospital) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.persist(hospital);
			entityTransaction.commit();
			
		}
		return hospital;
		
	}
	
	public Hospital updateHospital(Hospital hospital) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital2=entityManager.find(Hospital.class, hospital.getId());
		
		if(hospital2!=null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			
			
			
		}
		
		return hospital;
		
	}
	
	public Hospital deleteHospital(int id) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=entityManager.find(Hospital.class, id);
		
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			
			
			
		}
		
		return hospital;
		
	}
	
	public Hospital getHospitalById(int id) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Hospital hospital=entityManager.find(Hospital.class, id);
		 return hospital;
		
		
	}
	
	public List<Hospital> GetAllHospital(){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select h from Hospital h");
		
		List<Hospital> list=query.getResultList();
		 
		
		return list;
		
		
	}
	public Hospital HospitalLogin(String name, long phone) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		
		Query query=entityManager.createQuery("select h from  Hospital h where name=?1 and phone=?2");
		query.setParameter(1, name);
		query.setParameter(2, phone);
		
		
		List<Hospital> list=query.getResultList();
		
		if(list.size()>0) {
			return list.get(0);
		}
		
		return null;
		
	}

}
