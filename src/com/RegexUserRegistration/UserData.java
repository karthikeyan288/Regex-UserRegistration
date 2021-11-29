package com.RegexUserRegistration;

public class UserData {

	private String fname;
	private String lname;
	private String phonenumber;
	private String password;
	private String emailid;
	private static UserData instance;

	private UserData() {

	}

	public static UserData getInstance() {
		if (instance == null) {
			instance = new UserData();
		}
		return instance;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
