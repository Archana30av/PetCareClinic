package com.PetcareClinic.PetCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetcareClinic.PetCare.entity.Vet;
import com.PetcareClinic.PetCare.service.VetSService;
import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestController
@RequestMapping("Vet")
public class VetController 
{
	@Autowired
	VetSService vss;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Vet>> addvet(Vet vet){
		return vss.savevet(vet);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Vet>> findvet(int vetid){
		return vss.findvet(vetid);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Vet>> updatevet(Vet vet,int vetid){
		return vss.deletevet(vetid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Vet>> deletevet(int vetid){
		return vss.deletevet(vetid);
	}
}