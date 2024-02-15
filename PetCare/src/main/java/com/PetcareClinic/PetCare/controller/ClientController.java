package com.PetcareClinic.PetCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PetcareClinic.PetCare.entity.Client;
import com.PetcareClinic.PetCare.service.ClientSService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestController
@RequestMapping("Client")
public class ClientController 
{
	@Autowired
	ClientSService cserv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Client>> saveclient(@RequestBody Client client){
		return cserv.saveclient(client);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Client>> findclient(@RequestParam int clientid){
		return cserv.findclient(clientid);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Client>> updateclient(@RequestBody Client client, int clientid){
		return cserv.updateclient(client, clientid);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Client>> deleteclient(int clientid){
		return cserv.deleteadmin(clientid);
	}
	
}
