package com.PetcareClinic.PetCare.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Component
public class Vet
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	private String docName;
	private String docMail;	
}	
