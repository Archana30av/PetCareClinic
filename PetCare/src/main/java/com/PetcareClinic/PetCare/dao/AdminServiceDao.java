package com.PetcareClinic.PetCare.dao;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.entity.AdminService;
import com.PetcareClinic.PetCare.repo.AdminServicerepo;
@Repository
public class AdminServiceDao
{
	@Autowired
	AdminServicerepo asrepo;
	
	public AdminService saveadminservice(AdminService adminservice) {
		return asrepo.save(null);
	}
	public AdminService findadminservice(int adminserviceid) {
		Optional<AdminService> existing=asrepo.findById(adminserviceid);
		if(existing!=null) {
			return existing.get();
		}
		return null;
	}
	public AdminService updateadminservice(AdminService adminservice,int adminserviceid)
	{
		AdminService existing=findadminservice(adminserviceid);
		if(existing!=null) {
			adminservice.setAsid(adminserviceid);
			return asrepo.save(adminservice);
		}
		return  null;		
	}
	public AdminService deleteadminservice(int adminserviceid) {
		AdminService existing=findadminservice(adminserviceid);
		if(existing!=null) {
			asrepo.delete(existing);
			return existing;
		}
		return null;
	}
}
