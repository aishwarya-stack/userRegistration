package com.bridgelabz.userregregex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegParamertisedTest {

	String input;
	boolean expected;
	UserReg object;

	@Before
	public void initialize() {
		object = new UserReg();
	}

	// Constructor
	public UserRegParamertisedTest(String input, boolean expected) {
		super();
		this.input = input;
		this.expected = expected;

	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {

		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc", true }, { "abc-100@yahoo.com", true },
				{ "abc@.com.my", true }, });
	}

	@Test
	public void emailTest() {
		try {
			assertEquals(expected, object.validateEmail(input));
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}