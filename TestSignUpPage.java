package com.FacebookAutomation;

public class TestSignUpPage extends BaseTest {

	public static void main(String[] args) {
		
		SignUpPage objSignUpPage =new SignUpPage();
		objSignUpPage.intializationDriver();
		objSignUpPage.setFirstNameOfSignUpPage();
		objSignUpPage.setLastNameOfSignUpPage();
		objSignUpPage.passWord();
		objSignUpPage.getRandomMobile();
	
		
	}

}
