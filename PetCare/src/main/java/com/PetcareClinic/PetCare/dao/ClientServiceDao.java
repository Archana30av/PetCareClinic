package com.PetcareClinic.PetCare.dao;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetcareClinic.PetCare.entity.ClientService;
import com.PetcareClinic.PetCare.repo.ClientServicerepo;
@Repository
public class ClientServiceDao 
{	
	@Autowired
	ClientServicerepo csrepo;

	public ClientService saveclientservice(ClientService clientservice) {
		return csrepo.save(clientservice);
	}
	
	public ClientService findclientservice(int clientserviceid) {
		Optional<ClientService> existing=csrepo.findById(clientserviceid);
		if(existing!=null) {
			return existing.get();
		}
		return null;
	}
	
	public ClientService updateclientservice(ClientService clientservice, int clientserviceid) {
		ClientService existing=findclientservice(clientserviceid);
		if(existing!=null) {
			clientservice.setClientServiceId(clientserviceid);
			return csrepo.save(clientservice);
		}
		return null;
	}
	
	public ClientService deleteclientservice(int clientserviceid) {
		ClientService existing=findclientservice(clientserviceid);
		if(existing!=null) {
			csrepo.delete(existing);
			return existing;
		}
		return null;
	}
}
