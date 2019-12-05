package com.sarita.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saritak\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
// Select any check box
// grab the label of the selected checkbox //put it in a variable
// select an option in dropdown, here option to slection should come from step 2
// donot hardcode value
// enter step 2 grabbed label text in edit box
// click alert and then verify it text grabbed from step 2 is present in popup
// or not
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();

		if (text.contains(opt))

		{

			System.out.println("Alert message success");

		} else
			System.out.println("Something wrong with execution");

	}

	// System.out.println(
	// driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

}
