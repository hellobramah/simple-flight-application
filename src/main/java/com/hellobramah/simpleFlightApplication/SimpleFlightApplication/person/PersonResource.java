package com.hellobramah.simpleFlightApplication.SimpleFlightApplication.person;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;





public class PersonResource {
	@Autowired
	private PersonDAOService service;
	//GET /persons
	//RetrieveAllPersons()
	@GetMapping("/persons")
	private List<PersonBean> RetrieveAllPersons(){
		return service.findAll();
	}
	@GetMapping("/persons/{ID}")
	public PersonBean  RetrievePerson(@PathVariable int ID){
		 PersonBean person =service.findOne(ID);
		 if(person==null) throw new PersonNotFoundException("ID -"+ID);
		 return person;
	}
	//input details of person
		@PostMapping("/persons")
		private ResponseEntity<Object> createUser(@RequestBody PersonBean person){
			PersonBean savedPerson =service.save(person);
			//Created as a status
			//uri of new created entity\
			URI location =ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{ID}")
					.buildAndExpand(savedPerson.getID())
					.toUri();
			return ResponseEntity.created(location).build();
		}
		//output created plus person uri


}
