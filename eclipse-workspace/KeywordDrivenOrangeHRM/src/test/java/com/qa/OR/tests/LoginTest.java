package com.qa.OR.tests;

import org.testng.annotations.Test;

import com.qa.OR.keywordDriven.engine.KeywordEngine;

public class LoginTest {
	
	public KeywordEngine keywordEngine;
	
	@Test
	public void verifyLogin() {
		
		keywordEngine = new KeywordEngine();
		keywordEngine.startExecution("Login");	
		
		
	}

}
