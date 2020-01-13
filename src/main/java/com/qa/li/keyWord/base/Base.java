package com.qa.LI.Keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * @author PremSai Manthani
 * @purpose This class is the base class for launching the browser
 * 
 */

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String browserName) {

		if (browserName.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");

			if (prop.getProperty("headless").contentEquals("yes")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} else {
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"/home/user/home/Prem/LinkedInKeyWordDriven/src/main/java/com/qa/LI/KeyWord/Config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
