package com.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserInterface {
	public boolean validateMobileNumber(String mobileNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher mobileMatcher = regex.matcher(mobileNumber);
		return mobileMatcher.matches();
	}

	public static void main(String[] args) {
		UserInterface object = new UserInterface();
		System.out.println(object.validateMobileNumber("111-222-3333"));
	}
}

