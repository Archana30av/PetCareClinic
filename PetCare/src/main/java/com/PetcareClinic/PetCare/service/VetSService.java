package com.PetcareClinic.PetCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetcareClinic.PetCare.dao.AdminDao;
import com.PetcareClinic.PetCare.dao.VetDao;
import com.PetcareClinic.PetCare.entity.Admin;
import com.PetcareClinic.PetCare.entity.Vet;
import com.PetcareClinic.PetCare.util.ResponseStructure;
@Service
public class VetSService 
{
	@Autowired
	VetDao vdao;
	
	public ResponseEntity<ResponseStructure<Vet>> savevet(Vet vet) {
		ResponseStructure<Vet> existing=new ResponseStructure<Vet>();
		existing.setMessage("Vet Added");
		existing.setStatus(HttpStatus.CREATED.value());
		existing.setData(vdao.savevet(vet));
		return new ResponseEntity<ResponseStructure<Vet>>(existing,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Vet>> findvet(int vetid){
		ResponseStructure<Vet> existing=new ResponseStructure<Vet>();
		existing.setMessage("Admin Found");
		existing.setStatus(HttpStatus.FOUND.value());
		existing.setData(vdao.findvet(vetid));
		return new ResponseEntity<ResponseStructure<Vet>>(existing,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<Vet>> updatevet(int vetid,Vet vet){
		ResponseStructure<Vet> existing=new ResponseStructure<Vet>();
		existing.setMessage("Admin Updated");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(vdao.updatevet(vetid,vet));
		return new ResponseEntity<ResponseStructure<Vet>>(existing,HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<Vet>> deletevet(int vetid){
		ResponseStructure<Vet> existing=new ResponseStructure<Vet>();
		existing.setMessage("Admin Deleted");
		existing.setStatus(HttpStatus.OK.value());
		existing.setData(vdao.deletevet(vetid));
		return new ResponseEntity<ResponseStructure<Vet>>(existing, HttpStatus.OK);
	}
}
