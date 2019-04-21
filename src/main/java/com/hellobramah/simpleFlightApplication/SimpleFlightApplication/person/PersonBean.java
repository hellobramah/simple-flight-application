package com.hellobramah.simpleFlightApplication.SimpleFlightApplication.person;

import java.util.Date;

public class PersonBean {
	private Integer ID;
	private String name;
	private Date birthDate;
	
	public PersonBean() {
		
	}
	public PersonBean(Integer iD, String name, Date birthDate) {
		super();
		ID = iD;
		this.name = name;
		this.birthDate = birthDate;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	

}
