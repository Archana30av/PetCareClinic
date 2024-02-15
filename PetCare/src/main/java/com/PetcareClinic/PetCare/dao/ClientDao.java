package com.PetcareClinic.PetCare.dao;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetcareClinic.PetCare.entity.Client;
import com.PetcareClinic.PetCare.repo.Clientrepo;
@Repository
public class ClientDao 
{
	@Autowired
	Clientrepo crepo;
	
	public Client saveclient(Client client)
	{
		return crepo.save(client);
	}
	public Client findclient(int clientId)
	{
		Optional<Client> existing = crepo.findById(clientId);
		if(existing!=null) {
			return existing.get();
		}
		return null;
	}
	public Client updateclient(Client client,int clientId)
	{
		Client existing=findclient(clientId);
		if(existing!=null)
		{
			client.setClientId(clientId);
			return crepo.save(client);
		}
		return null;
	}
	public Client deleteclient(int clientId)
	{
		Client existing=findclient(clientId);
		if(existing!=null)
		{
			crepo.delete(existing);
			return existing;
		}
		return null;
		}	
}
