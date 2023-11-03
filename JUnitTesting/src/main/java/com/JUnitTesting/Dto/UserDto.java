package com.JUnitTesting.Dto;


public class UserDto {

	
	private long id;
	
	private String name;
	
	private String gender;
	
	private int age;
	
	private String role;
	
	
	

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(long id, String name, String gender, int age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", role=" + role + "]";
	}
	
	
}
