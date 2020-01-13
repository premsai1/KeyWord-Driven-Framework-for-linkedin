package com.qa.LI.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.LI.KeyWord.engine.KeyWordEngine;
/**
 * @author PremSai Manthani
 * @purpose This class perform the execution taking data from excel sheet
 * 
 */
public class LoginTest {

	public KeyWordEngine keyWordEngine;


	@Test
	public void loginTest() throws InterruptedException {
		keyWordEngine =new KeyWordEngine();
		keyWordEngine.startExecution("login");
		Thread.sleep(5000);
	}


}
