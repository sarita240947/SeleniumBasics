package com.sarita.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);

		// By Indexing if multiple instances is in web page
		// driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

		// Parent -Child XPath relationship
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}
	}

}