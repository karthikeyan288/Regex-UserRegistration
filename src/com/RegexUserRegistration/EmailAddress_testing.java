package com.RegexUserRegistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class EmailAddress_testing {

	String email;
	boolean expectedResult;
	JunitMethod junitMethod = JunitMethod.getInstance();
	UserData userData = UserData.getInstance();

	public EmailAddress_testing(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc-100@yahoo.com", true }, { "abc.100@yahoo.com", true },
				{ "abc111@abc.com", true }, { "abc", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com11", false }, { ".abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false }, });
	}
//	@Test
//	public void test_emailAddress_should_match_the_regexpattern() {
//		assertEquals(expectedResult,userData.getEmailid().matches(junitMethod.EMAIL_PATTERN));
//	}

	@Test
	public void test_email_should_match_the_regexpattern_asTrue() {
		boolean result = junitMethod.addemailAddress(userData);
		assertEquals(true, result);
	}

	@Test
	public void test_email_should_match_the_regexpattern_asFalse() {
		boolean result = junitMethod.addemailAddress(userData);
		assertEquals(false, result);
	}

}
