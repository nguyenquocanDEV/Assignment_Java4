package com.poly.domain;

public class LoginForm {
    private String id, password;
    private boolean rememberme;

    public LoginForm() {

    }

    public LoginForm(String id, String password, boolean rememberme) {
	super();
	this.id = id;
	this.password = password;
	this.rememberme = rememberme;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public boolean isRememberme() {
	return rememberme;
    }

    public void setRememberme(boolean rememberme) {
	this.rememberme = rememberme;
    }

}
