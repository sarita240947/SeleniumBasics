package com.sarita.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/"); //hit the url
		Actions a =new Actions(driver);
		WebElement move =driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		//mouse on hover
		a.moveToElement(driver.findElement(By.xpath("//div[@class='accountInner']"))).build().perform();
		// Search by entering capital letter
		a.moveToElement(driver.findElement(By.id("inputValEnter"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//moves to specific element
		a.moveToElement(move).contextClick().build().perform();

	}

}
