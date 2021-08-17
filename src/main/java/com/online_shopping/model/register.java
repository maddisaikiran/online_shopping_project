package com.online_shopping.model;

public class register {
	private int register_id;
	private String register_email;
	private String register_password;
	
	public  register(){

}

	public int getRegister_id() {
		return register_id;
	}

	public void setRegister_id(int register_id) {
		this.register_id = register_id;
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

	public register(int register_id, String register_email, String register_password) {
		super();
		this.register_id = register_id;
		this.register_email = register_email;
		this.register_password = register_password;
	}

	@Override
	public String toString() {
		return "register [register_id=" + register_id + ", register_email=" + register_email + ", register_password="
				+ register_password + "]";
	}
	
}
