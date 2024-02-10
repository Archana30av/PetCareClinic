package com.PetcareClinic.PetCare.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin 
{  
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	
	private AdminService AdminServices;
	
}
