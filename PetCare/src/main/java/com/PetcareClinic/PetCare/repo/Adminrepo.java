package com.PetcareClinic.PetCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetcareClinic.PetCare.entity.Admin;

public interface Adminrepo extends JpaRepository<Admin, Integer>
{
	abstract Admin findbyemail(String email);
}
