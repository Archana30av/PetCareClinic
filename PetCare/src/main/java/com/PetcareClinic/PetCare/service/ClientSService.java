package com.PetcareClinic.PetCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.dao.ClientDao;
import com.PetcareClinic.PetCare.entity.Client;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@Service
public class ClientSService
{
	@Autowired
	ClientDao adao;
	
	public ResponseEntity<ResponseStructure<Client>> saveclient(Client client) {
		ResponseStructure<Client> existing=new ResponseStructure<Client>();
		existing.setMessage("Client Added");
		existing.setStatus(HttpStatus.CREATED.value());
		existing.setData(adao.saveclient(client));
		return new ResponseEntity<ResponseStructure<Client>>(existing,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Client>> findclient(int clientid){
		ResponseStructure<Client> existing=new ResponseStructure<Client>();
		existing.setMessage("Client Found");
		existing.setStatus(HttpStatus.FOUND.value());
		existing.setData(adao.findclient(clientid));
		return new ResponseEntity<ResponseStructure<Client>>(existing,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<Client>> updateclient(Client client, int clientid){
		ResponseStructure<Client> existing=new ResponseStructure<Client>();
		existing.setMessage("Client Updated");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(adao.updateclient(client,clientid));
		return new ResponseEntity<ResponseStructure<Client>>(existing,HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<Client>> deleteadmin(int clientid){
		ResponseStructure<Client> existing=new ResponseStructure<Client>();
		existing.setMessage("Client Deleted");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(adao.deleteclient(clientid));
		return new ResponseEntity<ResponseStructure<Client>>(existing, HttpStatus.OK);
	}
}
