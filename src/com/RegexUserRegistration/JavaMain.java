package com.RegexUserRegistration;

import java.util.Scanner;

public class JavaMain {
	public static void main(String[] args) {
		JavaRegex regex = new JavaRegex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1.firstname 2.lastname :");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			regex.firstName();
			break;
		case 2:
			regex.lastName();
			break;

		default:
			System.out.println("Enter the valid data");
			break;
		}
	}

}
