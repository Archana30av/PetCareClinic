package com.PetcareClinic.PetCare.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Component
public class Client 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private  String clientName;
	private String clientEmail;
	private String clientPassword;
	private String clientAddress;
	
	
//	private ClientService ClientServices;
	
}
