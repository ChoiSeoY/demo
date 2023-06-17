package com.example.demo.dto;

import lombok.Data;

@Data
public class TestRequestBodyDTO {
	private int id;
	private String message;
	
	public int getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}	
	
}