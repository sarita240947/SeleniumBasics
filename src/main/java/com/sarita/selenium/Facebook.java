package com.sarita.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		// By ID locator
		/*
		 * driver.findElement(By.id("email")).sendKeys("saritasingh4709@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Abhinav12@");
		 */
		// By Name locator

		/*
		 * driver.findElement(By.name("email")).sendKeys("saritasingh4709@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("Abhinav12@");
		 * //driver.findElement(By.linkText("Forgotten account?")).click();
		 * driver.findElement(By.id("u_0_b")).click();
		 */
   
		// By customized XPath
		
		// driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Abhinav12@");
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saritasingh4709@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Abhinav12@");
		driver.findElement(By.xpath("//*[@value='Log In']")).click(); */
		
		//By customized CSS Selector 
		
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("saritasingh4709@gmail.com");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("Abhinav12@");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		

	}
}
