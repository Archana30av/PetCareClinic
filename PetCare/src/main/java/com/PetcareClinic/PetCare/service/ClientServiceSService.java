package com.PetcareClinic.PetCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.dao.ClientServiceDao;
import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.entity.ClientService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@Service
public class ClientServiceSService 
{
	@Autowired
	ClientServiceDao csdao;
	
	public ResponseEntity<ResponseStructure<ClientService>> saveclientservice(ClientService clientservice)
	{
		ResponseStructure<ClientService> existing=new ResponseStructure<ClientService>();
		existing.setMessage("Client Service Added");
		existing.setStatus(HttpStatus.CREATED.value());
		existing.setData(csdao.saveclientservice(clientservice));
		return new ResponseEntity<ResponseStructure<ClientService>>(existing,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<ClientService>> findclientservice(int clientserviceid){
		ResponseStructure<ClientService> existing=new ResponseStructure<ClientService>();
		existing.setMessage("ClientService Found");
		existing.setStatus(HttpStatus.FOUND.value());
		existing.setData(csdao.findclientservice(clientserviceid));
		return new ResponseEntity<ResponseStructure<ClientService>>(existing,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<ClientService>> updateclientservice(int clientserviceid,ClientService clientservice){
		ResponseStructure<ClientService> existing=new ResponseStructure<ClientService>();
		existing.setMessage("Client Service Updated");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(csdao.updateclientservice(clientservice,clientserviceid));
		return new ResponseEntity<ResponseStructure<ClientService>>(existing,HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<ClientService>> deleteclientservice(int clientserviceid){
		ResponseStructure<ClientService> existing=new ResponseStructure<ClientService>();
		existing.setMessage("Client Service Deleted");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(csdao.deleteclientservice(clientserviceid));
		return new ResponseEntity<ResponseStructure<ClientService>>(existing, HttpStatus.OK);
	}
}
