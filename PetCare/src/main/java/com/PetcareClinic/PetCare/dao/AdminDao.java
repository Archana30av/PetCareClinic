package com.PetcareClinic.PetCare.dao;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.repo.Adminrepo;

@Repository
public class AdminDao 
{
	@Autowired
	Adminrepo arepo;
	
	//all are entity objects
	public Admin saveadmin(Admin admin) 
	{
		return arepo.save(admin);
	}
	
	public Admin findadmin(int adminId) 
	{
		Optional <Admin> existing=arepo.findById(adminId);
		if(existing!=null)
			return existing.get();
		return null;
	}
	
	public Admin findbyemail(String email) 
	{
		Admin existing=arepo.findbyemail(email);
		if(existing!=null) {
			return existing;
		}
		return null;
	}
	
	public Admin updateadmin(int adminId,Admin admin)
	{
		Admin existing=findadmin(adminId);
		if(existing!=null) 
		{
			admin.setAdminId(adminId);
			 return arepo.save(admin);
		}
		return null;
	}
	
	public Admin deleteadmin(int adminId)
	{
		Admin existing=findadmin(adminId);
		if(existing!=null) 
		{
			arepo.delete(existing);	
			return existing;
		}
		return null;
	}
}
