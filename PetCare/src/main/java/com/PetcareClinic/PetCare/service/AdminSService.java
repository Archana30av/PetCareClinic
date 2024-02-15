package com.PetcareClinic.PetCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.dao.AdminDao;
import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@Service
public class AdminSService {
	
	@Autowired
	AdminDao adao;
	
	public ResponseEntity<ResponseStructure<Admin>> saveadmin(Admin admin) {
		ResponseStructure<Admin> existing=new ResponseStructure<Admin>();
		existing.setMessage("Admin Added");
		existing.setStatus(HttpStatus.CREATED.value());
		existing.setData(adao.saveadmin(admin));
		return new ResponseEntity<ResponseStructure<Admin>>(existing,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Admin>> findadmin(int adminid){
		ResponseStructure<Admin> existing=new ResponseStructure<Admin>();
		existing.setMessage("Admin Found");
		existing.setStatus(HttpStatus.FOUND.value());
		existing.setData(adao.findadmin(adminid));
		return new ResponseEntity<ResponseStructure<Admin>>(existing,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<Admin>> updateadmin(int adminid,Admin admin){
		ResponseStructure<Admin> existing=new ResponseStructure<Admin>();
		existing.setMessage("Admin Updated");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(adao.updateadmin(adminid,admin));
		return new ResponseEntity<ResponseStructure<Admin>>(existing,HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<Admin>> deleteadmin(int adminid){
		ResponseStructure<Admin> existing=new ResponseStructure<Admin>();
		existing.setMessage("Admin Deleted");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(adao.deleteadmin(adminid));
		return new ResponseEntity<ResponseStructure<Admin>>(existing, HttpStatus.OK);
	}
}
