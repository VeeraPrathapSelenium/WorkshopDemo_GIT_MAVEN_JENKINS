package com.tm.sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01_Login {
	
	@Test
	
	public static void launchBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
	}

}
