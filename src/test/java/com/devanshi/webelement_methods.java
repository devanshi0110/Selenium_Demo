package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement_methods {

	public static void sysout(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
//	driver.get("https://www.sugarcrm.com/au/request-demo/");
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.name("email")).sendKeys("dev@gmai.com");
//	driver.findElement(By.name("email")).clear();
//	
//	//sysout(driver.findElement(By.name("email")).getAttribute("pattern"));
//	
//	sysout(driver.findElement(By.name("email")).getCssValue("transition"));

		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.findElement(By.id("login-button")).getSize());
		System.out.println(driver.findElement(By.id("login-button")).getLocation());
		sysout(driver.findElement(By.id("login-button")).getTagName());
		sysout(driver.findElement(By.id("login-button")).getText());

		System.out.println(driver.findElement(By.id("login-button")).isDisplayed());
		System.out.println(driver.findElement(By.id("login-button")).isEnabled());
		System.out.println(driver.findElement(By.id("login-button")).isSelected());

	}

}
