package com.sarita.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		// Take screenshots 
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Users\\saritak\\Desktop\\AOL forms\\screenshots.png"));
		
	}

}
