package com.PetcareClinic.PetCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.dao.AdminServiceDao;
import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.entity.AdminService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@Service
public class AdminServiceSService 
{
	@Autowired
	AdminServiceDao asdao;
	
	public ResponseEntity<ResponseStructure<AdminService>> saveadminservice(AdminService admin){
		ResponseStructure<AdminService> existing=new ResponseStructure<AdminService>();
		existing.setMessage("Admin Service Added");
		existing.setStatus(HttpStatus.CREATED.value());
		existing.setData(asdao.saveadminservice(admin));
		return new ResponseEntity<ResponseStructure<AdminService>>(existing,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<AdminService>> findadminservice(int adminserviceid){
		ResponseStructure<AdminService> existing=new ResponseStructure<AdminService>();
		existing.setMessage("Admin Service Found");
		existing.setStatus(HttpStatus.FOUND.value());
		existing.setData(asdao.findadminservice(adminserviceid));
		return new ResponseEntity<ResponseStructure<AdminService>>(existing,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<AdminService>> updateadminservice(int adminserviceid, AdminService adminservice){
		ResponseStructure<AdminService> existing=new ResponseStructure<AdminService>();
		existing.setMessage("Admin Service Updated");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(asdao.saveadminservice(adminservice));
		return new ResponseEntity<ResponseStructure<AdminService>>(existing, HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<AdminService>> deleteadmin(int adminserviceid){
		ResponseStructure<AdminService> existing=new ResponseStructure<AdminService>();
		existing.setMessage("Admin Service Deleted");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(asdao.deleteadminservice(adminserviceid));
		return new ResponseEntity<ResponseStructure<AdminService>>(existing, HttpStatus.OK);
	}
}