package com.online_shopping.model;

public class Register {
	private int register_id;
	private String register_first_name;
	private String register_last_name;
	private String register_email;
	private String register_password;
	
	public Register() {
		
	}

	public int getRegister_id() {
		return register_id;
	}

	public void setRegister_id(int register_id) {
		this.register_id = register_id;
	}

	public String getRegister_first_name() {
		return register_first_name;
	}

	public void setRegister_first_name(String register_first_name) {
		this.register_first_name = register_first_name;
	}

	public String getRegister_last_name() {
		return register_last_name;
	}

	public void setRegister_last_name(String register_last_name) {
		this.register_last_name = register_last_name;
	}

	public String getRegister_email() {
		return register_email;
	}

	public void setRegister_email(String register_email) {
		this.register_email = register_email;
	}

	public String getRegister_password() {
		return register_password;
	}

	public void setRegister_password(String register_password) {
		this.register_password = register_password;
	}


	@Override
	public String toString() {
		return "Register [register_id=" + register_id + ", register_first_name=" + register_first_name
				+ ", register_last_name=" + register_last_name + ", register_email=" + register_email
				+ ", register_password=" + register_password + "]";
	}
	
	
 
	
}
