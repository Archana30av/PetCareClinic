package com.PetcareClinic.PetCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetcareClinic.PetCare.entity.ClientService;

public interface ClientServicerepo extends JpaRepository<ClientService, Integer>
{

}
