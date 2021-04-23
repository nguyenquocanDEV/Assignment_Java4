package com.poly.domain;

public class ChangePasswordForm {
    private String id;
    private String password;
    private String confirmPassword;
    private String currentPassword;

    public ChangePasswordForm() {

    }

    public ChangePasswordForm(String id, String password, String confirmPassword, String currentPassword) {

	this.id = id;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.currentPassword = currentPassword;
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

    public String getConfirmPassword() {
	return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
    }

    public String getCurrentPassword() {
	return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
	this.currentPassword = currentPassword;
    }

}
