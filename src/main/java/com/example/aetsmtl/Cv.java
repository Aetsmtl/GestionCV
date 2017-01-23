package com.example.aetsmtl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cv {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	String role;
	
	public Cv ()
	{}
	
	public Cv (String name, String role)
	{
		this.name = name;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
