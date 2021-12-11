package com.RegexUserRegistration;

import org.junit.matchers.JUnitMatchers;

public class UserMain {
	public static void main(String[] args) throws InvalidUserDetailException {
		JunitMethod junitMethod = JunitMethod.getInstance();
			junitMethod.addfirstName();
			junitMethod.addlastName();
			junitMethod.addphoneNumber();
			junitMethod.addpassWord();
			junitMethod.addemailId();
	
	}

}
