package com.RegexUserRegistration;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JunitMethod {

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

	public void addfirstName() {
		System.out.println("Enter the First Name : ");
		String fname = sc.nextLine();
		userData.setFname(fname);
		boolean b3 = Pattern.matches(NAME_PATTERN, fname);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void addlastName() {
		System.out.println("Enter the Last Name : ");
		String lname = sc.nextLine();
		userData.setLname(lname);
		boolean b3 = Pattern.matches(NAME_PATTERN, lname);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void addphoneNumber() {
		System.out.println("Enter the mobile Number : ");
		String phonenumber = sc.nextLine();
		userData.setPhonenumber(phonenumber);
		boolean b3 = Pattern.matches(MOBILE_NUMBER, phonenumber);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void addpassWord() {
		System.out.println("Enter the  Pass Word : ");
		String password = sc.nextLine();
		userData.setPassword(password);
		;
		boolean b3 = Pattern.matches(PASSWORD, password);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void addemailId() {
		System.out.println("Enter the email id : ");
		String emailid = sc.nextLine();
		boolean b3 = Pattern.matches(EMAIL_PATTERN, emailid);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}
}
