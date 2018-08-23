package com.qa.bae.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.bae.domain.Student;

public class StudentService {
	
	private Map<Integer, Student> studentMap;
	private Integer counter = 1;
	
	public StudentService() 
	{
		studentMap = new HashMap<>();
	}
	
	public void addStudentToMap(Student studentToAdd) 
	{
		studentMap.put(counter, studentToAdd);
		counter++;
	}
}
