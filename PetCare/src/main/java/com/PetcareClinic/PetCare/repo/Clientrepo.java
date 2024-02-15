package com.PetcareClinic.PetCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetcareClinic.PetCare.entity.Client;

public interface Clientrepo extends JpaRepository<Client, Integer>{

}
