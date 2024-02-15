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

import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.service.AdminSService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestController
@RequestMapping("admin")
public class AdminController
{
	@Autowired
	AdminSService aserv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Admin>> saveadmin(@RequestBody Admin admin){
		return aserv.saveadmin(admin);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Admin>> findadmin(@RequestParam int adminid){
		return aserv.findadmin(adminid);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Admin>> updateadmin(@RequestBody Admin admin, @RequestParam int adminid){
		return aserv.findadmin(adminid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Admin>> deleteadmin(@RequestParam int adminid){
		return aserv.deleteadmin(adminid);
	}
}

