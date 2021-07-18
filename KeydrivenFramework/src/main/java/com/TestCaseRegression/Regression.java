package com.TestCaseRegression;

import com.keywords.Keyword;

public class Regression {
	public static void main(String[] args) throws InterruptedException {
		
	
		
		Keyword.openBrowser("Chrome");
		Keyword.openURL("https://www.facebook.com/");
		Keyword.enterText("XPATH","//input[@type=\"text\"]","");
		Keyword.enterText("XPATH","//input[@type=\"password\"]", "");
		Keyword.clickOnElement("XPATH","//button[@name=\"login\"]");
        Keyword.selectValueFromDropdown("XPATH", "//select[@name=\"birthday_day\"]", "24") ; 
		Keyword.selectValueFromDropdown("XPATH", "//select[@name=\"birthday_month\"]", "feb");
		Keyword.selectValueFromDropdown("XPATH", "//select[@name=\"birthday_year\"]", "1994");
		Keyword.enterText("XPATH","//input[@name=\"firstname\"]","HARSHA");
		Keyword.enterText("XPATH","//input[@name=\"lastname\"]","BHOYAR");
		Keyword.enterText("XPATH","//Input[@name=\"reg_email__\"]","8379015397");
		Keyword.enterText("XPATH", "//input[@name=\"reg_passwd__\"]", "SAIBABA");
				
	}
	
	
	
	
	
	

}
