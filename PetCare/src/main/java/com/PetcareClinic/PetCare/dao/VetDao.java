package com.PetcareClinic.PetCare.dao;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetcareClinic.PetCare.entity.Vet;
import com.PetcareClinic.PetCare.repo.vetrepo;

@Repository
public class VetDao {
	@Autowired
	vetrepo vrepo;
	
	public Vet savevet(Vet vet)
	{
		 return vrepo.save(vet);
	}
	
	public Vet findvet(int docId)
	{
		Optional<Vet> existing=vrepo.findById(docId);
		if(existing!=null)
		{
			return existing.get();
		}
		return null;
	}
	public Vet updatevet(int docId,Vet vet) 
	{
		Vet existing=findvet(docId);
		if(existing!=null)
		{
			vet.setDocId(docId);
			return vrepo.save(vet);
		}
		return null;
	}
	public Vet deletevet(int docId)
	{
		Vet existing=findvet(docId);
		if(existing!=null)
		{
			vrepo.delete(existing);
			return existing;
		}
		return null;
	}
}
