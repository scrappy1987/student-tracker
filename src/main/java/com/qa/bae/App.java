package com.qa.bae;

import com.qa.bae.domain.Student;
import com.qa.bae.service.StudentService;

public class App {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student tony = new Student("Tony", "Glover");
		service.addStudentToMap(tony);

	}

}
