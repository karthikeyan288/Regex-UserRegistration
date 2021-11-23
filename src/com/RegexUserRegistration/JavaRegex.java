package com.RegexUserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {
	Scanner sc = new Scanner(System.in);

	public void firstName() {
		System.out.println("Enter the First Name : ");
		String value = sc.nextLine();
		String pattern = "^[A-Z][a-z]{3,}";
		boolean b3 = Pattern.matches(pattern, value);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void lastName() {
		System.out.println("Enter the Last Name : ");
		String value = sc.nextLine();
		String pattern = "^[A-Z][a-z]{3,}";
		boolean b3 = Pattern.matches(pattern, value);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void emailId() {
		System.out.println("Enter the email id : ");
		String value = sc.nextLine();
		String pattern = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
		boolean b3 = Pattern.matches(pattern, value);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void mobileNumber() {
		System.out.println("Enter the mobile Number : ");
		String number = sc.nextLine();
		String pattern = "^[91]+\\s\\d{10}$";
		boolean b3 = Pattern.matches(pattern, number);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}

	}
}
