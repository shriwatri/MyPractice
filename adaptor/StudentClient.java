package com.shriwatri.designpattern.adaptor;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
	
	public List<Student> getStudentList(){
		List<Student> students = new ArrayList<>();
		CollegeStudent collegeStudent = new CollegeStudent("Ashish", "Shriwatri","a@gmail.com");
		SchoolStudent schoolStudent = new SchoolStudent("Anupam", "Shriwatri", "anupam@gmail.com");
		
		students.add(collegeStudent);
		students.add(new SchoolStudentAdaptor(schoolStudent));
		return students;
		
	}

}
