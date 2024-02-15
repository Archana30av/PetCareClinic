package com.PetcareClinic.PetCare.dto;

import org.springframework.stereotype.Component;

import com.PetcareClinic.PetCare.entity.AdminService;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class AdminDto 
{  
	private int adminId;
	private String adminName;
	private String adminEmail;

	private AdminService AdminServices;
	
}