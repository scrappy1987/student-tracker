package com.qa.bae.domain;

public class Student {
	
	private String firstName;
	private String surname;
	
	public Student(String firstName, String surname) 
	{
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", surname=" + surname + "]";
	}
}	
