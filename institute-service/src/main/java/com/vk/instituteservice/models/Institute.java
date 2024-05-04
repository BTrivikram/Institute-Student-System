package com.vk.instituteservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Institute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String email;

	public Institute(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Institute() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Institute{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
	}
}
