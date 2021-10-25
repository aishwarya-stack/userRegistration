package com.bridgelabz.userregregex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegTest {
	@Test
	public void firstNameReturnTrueWhenValid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateFirstName("Firstnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void firstNameReturnFalseWhenInvalid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateFirstName("firstnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnTrueWhenValid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateLastName("Lastnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnFalseWhenInvalid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateLastName("lastnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnTrueWhenValid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateEmail("example.correct@mail.com");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnFalseWhenInvalid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validateEmail("example.wrong.mail.com");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnTrueWhenValid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validatePhone("911234567890");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnFalseWhenInvalid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validatePhone("123456789X");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnTrueWhenValid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validatePassword("ExampleCorrectPassword123#");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnFalseWhenInvalid() {
		UserReg object = new UserReg();
		try {
			boolean result = object.validatePassword("examplewrongpassword");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}