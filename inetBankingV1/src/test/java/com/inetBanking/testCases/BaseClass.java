package com.inetBanking.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public String baseURL = "https://demo.guru99.com/v4/";
	public String Username = "mngr238392";
	public String Password = "natyvEs";
	public static WebDriver driver;
	public static Logger logger;
	

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\velocity program\\inetBankingV1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
				
		logger = LogManager.getLogger(TC_LoginPage_001.class);
		 PropertyConfigurator.configure("log4j2.properties");
	
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
