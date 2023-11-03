package com.JUnitTesting.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private long id;
	
	@Column(name = "USER_NAME")
	private String name;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "ROLE")
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(long id, String name, String gender, int age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.role = role;
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


	public long getId() {
		return id;
	}

	
	
	
	
}
