package com.hellobramah.simpleFlightApplication.SimpleFlightApplication.person;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException {

	protected PersonNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
