package com.bridgelabz.userregregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg {
	public static final Scanner sc = new Scanner(System.in);
	public final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	public final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	public final String EMAIL_PATTERN = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z]*[a-z]*?$";
	public final String PHONE_PATTERN = "^[0-9]{2}[0-9]{10}$";
	public final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		boolean result = pattern.matcher(fname).matches();
		if(result == true) {
			return true;
		}
		else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
			
	}

	// This method checks if the entered lawst name is valid
	public boolean validateLastName(String lname) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		boolean result = pattern.matcher(lname).matches();
		if(result == true) {
			return true;
		}
		else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered email is valid
	public boolean validateEmail(String email) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		boolean result = pattern.matcher(email).matches();
		if(result == true) {
			return true;
		}
		else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered phone number is valid
	public boolean validatePhone(String phone) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		boolean result = pattern.matcher(phone).matches();
		if(result == true) {
			return true;
		}
		else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}
	
	// This method checks if the entered password is valid
	public boolean validatePassword(String password) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		boolean result = pattern.matcher(password).matches();
		if(result == true) {
			return true;
		}
		else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	
	// This is the main function
	public static void main(String[] args)throws UserRegistrationException{

		UserReg obj = new UserReg();
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		obj.validateFirstName(fname);

		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		obj.validateFirstName(lname);


		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		obj.validateEmail(email);


		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		obj.validatePhone(phone);
		
		System.out.println("\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		obj.validatePassword(password);

		System.out.println("\nSamples Emails to Test");
		obj.validateEmail("abc@yahoo.com");
		obj.validateEmail("abc-100@yahoo.com");
		obj.validateEmail("abc.100@yahoo.com");
		obj.validateEmail("abc111@abc.com");
		obj.validateEmail("abc-100@abc.net");
		obj.validateEmail("abc.100@abc.com.au");
		obj.validateEmail("abc@1.com");
		obj.validateEmail("abc@gmail.com.com");
		obj.validateEmail("abc+100@gmail.com");
	}
}