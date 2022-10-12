package com.training.web;

public class USERPASS {
	private String username;
	private String password;
	
	public USERPASS(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
