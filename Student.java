package com.shriwatri;

public class Student {
	private Integer id;
	private String name;
	private String emai;
	
	
	public Student(Integer id, String name, String emai) {
		super();
		this.id = id;
		this.name = name;
		this.emai = emai;
	}
	
	


	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmai() {
		return emai;
	}




	public void setEmai(String emai) {
		this.emai = emai;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emai=" + emai + "]";
	}
	
	

}
