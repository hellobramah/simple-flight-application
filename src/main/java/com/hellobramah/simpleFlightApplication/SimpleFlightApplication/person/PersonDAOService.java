package com.hellobramah.simpleFlightApplication.SimpleFlightApplication.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.hellobramah.simpleFlightApplication.SimpleFlightApplication.person.PersonBean;



public class PersonDAOService {

	//Create a list of persons
	private static List<PersonBean> persons= new ArrayList<>();
	private static int personCounter=5;
	
	static {
		persons.add(new PersonBean(1, "Donald Trump", new Date()));
		persons.add(new PersonBean(2, "Jacky Chan", new Date()));
		persons.add(new PersonBean(3, "James Bond", new Date()));
		persons.add(new PersonBean(4, "Donald Duck", new Date()));
		persons.add(new PersonBean(5, "James Brown", new Date()));
			
	}
	public List<PersonBean> findAll(){
		return persons;
		
	}
	public PersonBean save(PersonBean person) {
		if(person.getID()==null) {
			person.setID(++personCounter);
		}
		persons.add(person);
		return person;
	}
	public PersonBean findOne(int ID) {
		for(PersonBean person:persons) {
			if (person.getID()==ID){
				return person;
			}
			
		}
		return null;
	}
}
