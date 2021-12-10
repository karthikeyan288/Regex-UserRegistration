package com.RegexUserRegistration;

import java.rmi.server.UID;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JunitMethod extends Exception {

	public final static String NAME_PATTERN = "^([A-Z]{1}+[a-z]{2,})*$";
	public final static String MOBILE_NUMBER = "^[91]+\\s\\d{10}$";
	public final static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*(@)).{8,}$";
	public final static String EMAIL_PATTERN = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	private static JunitMethod instance;

	private JunitMethod() {

	}

	public static JunitMethod getInstance() {
		if (instance == null) {
			instance = new JunitMethod();
		}
		return instance;
	}

	UserData userData = UserData.getInstance();
	Scanner sc = new Scanner(System.in);

	public void addfirstName() throws InvalidUserDetailException {
		IUserRegistration firstname = (fname) -> {
			System.out.println("Enter the first Name : ");
			fname = sc.nextLine();
			userData.setFname(fname);
			if (fname.matches(NAME_PATTERN))
				System.out.println("Match Found");
			throw new InvalidUserDetailException("enter the valid data");
		};
		System.out.println(firstname);
	}

	public void addlastName() throws InvalidUserDetailException {
		IUserRegistration lastname = (lname) -> {
			System.out.println("Enter the Last Name : ");
			lname = sc.nextLine();
			userData.setLname(lname);
			if (lname.matches(NAME_PATTERN))
				System.out.println("Match Found");
			throw new InvalidUserDetailException("enter the valid data");
		};
		System.out.println(lastname);
	}

	public void addphoneNumber() throws InvalidUserDetailException {
		IUserRegistration phonenumber = (phoneno) -> {
			System.out.println("Enter the Last Name : ");
			phoneno = sc.nextLine();
			userData.setLname(phoneno);
			if (phoneno.matches(NAME_PATTERN))
				System.out.println("Match Found");
			throw new InvalidUserDetailException("enter the valid data");
		};
		System.out.println(phonenumber);
	}

	public void addpassWord() throws InvalidUserDetailException {
		IUserRegistration password = (pass) -> {
			System.out.println("Enter the Last Name : ");
			pass = sc.nextLine();
			userData.setLname(pass);
			if (pass.matches(NAME_PATTERN))
				System.out.println("Match Found");
			throw new InvalidUserDetailException("enter the valid data");
		};
		System.out.println(password);
	}

	public boolean addemailAddress(UserData userData) {
		return Pattern.matches(EMAIL_PATTERN, userData.getEmailid());
	}

	public void addemailId() throws InvalidUserDetailException {
		IUserRegistration emailId = (email) -> {
			System.out.println("Enter the Last Name : ");
			email = sc.nextLine();
			userData.setLname(email);
			if (email.matches(NAME_PATTERN))
				System.out.println("Match Found");
			throw new InvalidUserDetailException("enter the valid data");
		};
		System.out.println(emailId);
	}
}
