package com.sarita.selenium;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/accounts/answer/27441?hl=en");
		driver.findElement(By.xpath("//a[contains(text(),'Google products')]")).click();
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentId =it.next();
		String ChildId =it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
