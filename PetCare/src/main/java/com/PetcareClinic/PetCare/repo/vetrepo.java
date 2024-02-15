package com.PetcareClinic.PetCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetcareClinic.PetCare.entity.Vet;

public interface vetrepo extends JpaRepository<Vet, Integer> {

}
