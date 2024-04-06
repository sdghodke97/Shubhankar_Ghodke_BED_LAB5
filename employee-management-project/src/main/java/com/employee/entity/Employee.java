package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	@Id
	private int Id;
	
	@Column(name="First_Name")
	private String First_Name;
	
	@Column(name="Last_Name")
	private String Last_Name;
	
	@Column(name="Email")
	private String Email;

	public Employee() {
		
	}
	
	public Employee(int id, String first_Name, String last_Name, String email) {
		
		Id = id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email
				+ "]";
	}
	
	
}
