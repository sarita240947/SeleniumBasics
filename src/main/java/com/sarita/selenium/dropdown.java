package com.sarita.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*
		 * Select s = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * //s.selectByValue("USD"); //s.selectByIndex(2); s.selectByVisibleText("AED");
		 */

		/*System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());  //issue   */
		
		
         Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
         driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
         Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
         
		// Count the no of checkbox

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

		// Since selenium scans from top left so only first checkbox will get selected

		driver.findElement(By.xpath("//label[contains(text(),'Indian Armed Forces')]"));
	}

}
