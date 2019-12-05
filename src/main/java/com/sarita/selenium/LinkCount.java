package com.sarita.selenium;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size()); //getting the count of the link in page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  //limiting Webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); // getting the count of link in footer section 
		
		//getting the count of link in footer section only for 1st column 
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		//Click on each link in page and have to open in separate window 
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
		String clickonLinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		 Thread.sleep(5000);
		 
		}
		
		//open all tab
		
		Set<String> abc =driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
