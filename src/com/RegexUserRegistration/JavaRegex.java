package com.RegexUserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {
	public void firstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name : ");
		String value = sc.nextLine();
		String pattern =  "^[A-Z][a-z]{3,}";
		boolean b3 = Pattern.matches(pattern, value);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

	public void lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name : ");
		String value = sc.nextLine();
		String pattern =  "^[A-Z][a-z]{3,}";//"^[91]+\\s\\d{10}$";
		boolean b3 = Pattern.matches(pattern, value);
		if (b3) {
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
		}
	}

}
