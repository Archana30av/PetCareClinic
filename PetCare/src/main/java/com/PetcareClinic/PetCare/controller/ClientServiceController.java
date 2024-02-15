package com.PetcareClinic.PetCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetcareClinic.PetCare.entity.ClientService;
import com.PetcareClinic.PetCare.service.ClientServiceSService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestController
@RequestMapping("ClientService")
public class ClientServiceController
{
	@Autowired
	ClientServiceSService csserv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<ClientService>> saveclientservice(ClientService clientservice){
		return csserv.saveclientservice(clientservice);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<ClientService>> findclientservice(int clientserviceid){
		return csserv.findclientservice(clientserviceid);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<ClientService>> updateclientservice(ClientService clientservice, int clientserviceid){
		return csserv.updateclientservice(clientserviceid, clientservice);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<ClientService>> deleteclientservice(int clientserviceid){
		return csserv.deleteclientservice(clientserviceid);
	}
}
