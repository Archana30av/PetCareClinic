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
public class AdminService 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int asid;
	
	private boolean bath;
	private boolean haircut;
	private boolean nailcut;
	private boolean brush;
	private int daycare;
	
}
