package com.PetcareClinic.PetCare.ExceptionHandler;

import lombok.Getter;

@Getter
public class AdminNotFound extends RuntimeException
{
	String message;

	public AdminNotFound(String message)
	{
		this.message = message;
	}
	
}
