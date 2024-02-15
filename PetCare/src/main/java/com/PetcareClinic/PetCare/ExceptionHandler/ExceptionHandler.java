package com.PetcareClinic.PetCare.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.PetcareClinic.PetCare.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler
{
		@org.springframework.web.bind.annotation.ExceptionHandler
		public ResponseEntity<ResponseStructure<String>> adminnotfound (AdminNotFound admin)
		{
		ResponseStructure<String> existing=new ResponseStructure<String>();
		existing.setMessage("Admin  not Found");
		existing.setData(admin.getMessage());
		existing.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(existing,HttpStatus.NOT_FOUND);
		}
		
		@org.springframework.web.bind.annotation.ExceptionHandler
		public ResponseEntity<ResponseStructure<String>> clientnotfound(ClientNotFound client)
		{
		ResponseStructure<String> existing=new ResponseStructure<String>();
		existing.setMessage("Client Not Found");
		existing.setData(client.getMessage());
		existing.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(existing, HttpStatus.NOT_FOUND);
		}
		
//		@org.springframework.web.bind.annotation.ExceptionHandler
//		public ResponseEntity<ResponseStructure<String>>
		
}