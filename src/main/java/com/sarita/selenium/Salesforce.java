package com.sarita.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("saritasingh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("5432543524");
		// driver.findElement(By.ClassName("button r4 wide primary")).click(); //Error
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());

	}

}
