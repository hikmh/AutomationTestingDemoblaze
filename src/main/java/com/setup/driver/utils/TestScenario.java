package com.setup.driver.utils;
public enum TestScenario {
		
	T1("Validate Username and password betwen 8 to 16 character, must contain special character, at least one uppecase character and have a numerical"),
	T2("Validate username and password less than 8 character, contain special character, at least one uppercase character and have a numerical "),
	T3("Validate username and password more than 16 character, contain special character, at least one uppercase character and have a numerical"),
	T4("Validate username and password betwen 8 to 16 character, without contain special character, have a at least one uppercase character and have a numerical"),
	T5("Validate username and password betwen 8 to 16 character, contain special character, without uppercase character and have a numerical "),
	T6("Validate username and password betwen 8 to 16 character, contain special character, have atleast one uppercase character and without a numerical"),
	T7("Duplicate username "),
	T8("Null username "),
	T9("Null password"),
	T10("Valid credential"),
	T11("Valid credential with ignore letter case"),
	T12("Invalid username login"),
	T13("Invalid pasword login"),
	T14("Null username login"),
	T15("Null pasword login"),
	T16("Fill email name and message"),
	T17("Fill name and message with null email"),
	T18("Fill email and message with null name"),
	T19("Fill name and email with null message"),
	T20(""),
	T21("Logout sebagai Super Admin"),
	T22("Logout sebagai Admin");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
