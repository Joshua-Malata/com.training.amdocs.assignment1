package com.training.web;

import java.io.Serializable;
public class account implements Serializable {
	private static final long serialVersionUID = 1L;
    private String acountType;
    private String username;
    private String password;
	public String getAcountType() {
		return acountType;
	}
	public void setAcountType(String acountType) {
		this.acountType = acountType;
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
