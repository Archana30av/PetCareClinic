package com.PetcareClinic.PetCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PetcareClinic.PetCare.entity.AdminService;
import com.PetcareClinic.PetCare.service.AdminServiceSService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestController
@RequestMapping("AdminService")
public class AdminServiceController 
{
	@Autowired
	AdminServiceSService asserv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<AdminService>> saveadminservice(@RequestBody AdminService adminservice){
		return asserv.saveadminservice(adminservice);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<AdminService>> findadminservice(@RequestParam int adminserviceid){
		return asserv.findadminservice(adminserviceid);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<AdminService>> updateadminservice(@RequestBody AdminService adminservice,@RequestParam int adminserviceid){
		return asserv.updateadminservice(adminserviceid, adminservice);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<AdminService>> deleteadminservice(@RequestParam int adminserviceid){
		return asserv.deleteadmin(adminserviceid);
	}
}