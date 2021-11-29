package com.RegexUserRegistration;

import java.util.Scanner;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class JavaMain{
	static JunitMethod junitMethod;
	static UserData userData;

	@Before
	public void init() {
		junitMethod = JunitMethod.getInstance();
		userData = UserData.getInstance();
	}

	@Test
	public void test_firstname_should_match_the_regexpattern_asTrue() {
		junitMethod.addfirstName();
		assertEquals(true, userData.getFname().matches(junitMethod.NAME_PATTERN));
	}

	@Test
	public void test_firstname_should_match_the_regexpattern_asFalse() {
		junitMethod.addfirstName();
		assertEquals(false, userData.getFname().matches(junitMethod.NAME_PATTERN));
	}

	@Test
	public void test_lastname_should_match_the_regexpattern_asTrue() {
		junitMethod.addlastName();
		assertEquals(true, userData.getLname().matches(junitMethod.NAME_PATTERN));
	}

	@Test
	public void test_lastname_should_match_the_regexpattern_asFalse() {
		junitMethod.addlastName();
		assertEquals(false, userData.getLname().matches(junitMethod.NAME_PATTERN));
	}

	@Test
	public void test_phoneNumber_should_match_the_regexpattern_asTrue() {
		junitMethod.addphoneNumber();
		assertEquals(true, userData.getPhonenumber().matches(junitMethod.MOBILE_NUMBER));
	}

	@Test
	public void test_phoneNumber_should_match_the_regexpattern_asFalse() {
		junitMethod.addphoneNumber();
		assertEquals(false, userData.getPhonenumber().matches(junitMethod.MOBILE_NUMBER));
	}

	@Test
	public void test_password_should_match_the_regexpattern_asTrue() {
		junitMethod.addpassWord();
		assertEquals(true, userData.getPassword().matches(junitMethod.PASSWORD));
	}

	@Test
	public void test_password_should_match_the_regexpattern_asFalse() {
		junitMethod.addpassWord();
		assertEquals(false, userData.getPassword().matches(junitMethod.PASSWORD));
	}

	@Test
	public void test_emailid_should_match_the_regexpattern_asTrue() {
		junitMethod.addemailId();
		assertEquals(true, userData.getEmailid().matches(junitMethod.EMAIL_PATTERN));
	}

	@Test
	public void test_emailid_should_match_the_regexpattern_asFalse() {
		junitMethod.addemailId();
		assertEquals(false, userData.getEmailid().matches(junitMethod.EMAIL_PATTERN));
	}

}

