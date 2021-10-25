package com.bridgelabz.userregregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg {
	public static final Scanner sc = new Scanner(System.in);
	public final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	// This is the main function
	public static void main(String[] args) {
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		UserReg obj = new UserReg();
		if (obj.validateFirstName(fname)) {
			System.out.println("First Name Valid");
		} else {
			System.out.println("First Name Invalid");
		}
	}
}