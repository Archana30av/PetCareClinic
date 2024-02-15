package com.PetcareClinic.PetCare.ExceptionHandler;

import lombok.Getter;

@Getter
public class ClientNotFound extends RuntimeException
{
	String message;

	public ClientNotFound(String message)
	{
		this.message = message;
	}
}
