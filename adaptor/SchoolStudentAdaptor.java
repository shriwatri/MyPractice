package com.shriwatri.designpattern.adaptor;

public class SchoolStudentAdaptor implements Student {
	private SchoolStudent schoolStudent;
	
	public SchoolStudentAdaptor(SchoolStudent schoolStudent) {
		this.schoolStudent = schoolStudent;
	}

	@Override
	public String getName() {
		return this.schoolStudent.getFirstName();
	}

	@Override
	public String getSurName() {		
		return this.schoolStudent.getLastName();
	}

	@Override
	public String getEmail() {
		return this.schoolStudent.getEmailAddress();
	}

}
