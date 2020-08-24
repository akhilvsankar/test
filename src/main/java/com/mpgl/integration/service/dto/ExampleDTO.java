package com.mpgl.integration.service.dto;

import java.io.Serializable;

public class ExampleDTO implements Serializable{
	
	private Long id;
	private String firstName;
	
	public ExampleDTO() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
