package com.shriwatri.designpattern.adaptor;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		StudentClient client = new StudentClient();
		List<Student> studentList = client.getStudentList();
		
		for(Student s:studentList) {
			System.out.println(s.getName()+" "+ s.getSurName()+" "+s.getEmail());
		}

	}

}
