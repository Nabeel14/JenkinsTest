package testCases;

import utilities.Utilities;
import pages.LandingPage;


public class Test1 {
	
	public static void main(String[] args) {
	
	Utilities.startBrowser("chrome", "https://www.chapters.indigo.ca/en-ca/");	
	LandingPage.openAccountDrawer();
	

	LandingPage.clickSignInButton();
	
	LandingPage.fillLogin("TestUserName","TestPassword");
	System.out.println("Sign in Clicked");
	LandingPage.verifyWrongUsernamePasswordError();
	System.out.println("Incorrect email text shown");
	
	//Utilities.CloseDriver();
	}
}
