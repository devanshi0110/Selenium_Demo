package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class relativelocator {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		// WebElement password=/driver.findElement(By.id("password"));
		// driver.findElement(By.id("form_input")).sendKeys("error_user");
		// driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
		System.out.println("Cases Are Success..");

	}

}
