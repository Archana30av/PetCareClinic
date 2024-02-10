package com.PetcareClinic.PetCare.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client 
{
	private int clientId;
	private  String clientName;
	private String clientEmail;
	private String clientPassword;
	private String clientAddress;
	private ClientService ClientServices;
	
}
