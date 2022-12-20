package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	private Integer id;

	private String FristName;
	private String LastName;

	@ManyToOne
	private String Location;
	private String Email;

	public User() {

	}

	public User(Integer id, String fristName, String lastName, String location, String email) {
		super();
		this.id = id;
		this.FristName = fristName;
		this.LastName = lastName;
		this.Location = location;
		this.Email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFristName() {
		return FristName;
	}

	public void setFristName(String fristName) {
		FristName = fristName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FristName=" + FristName + ", LastName=" + LastName + ", Location=" + Location
				+ ", Email=" + Email + "]";
	}

}
