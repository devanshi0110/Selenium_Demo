package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_login {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		// driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kshirsagardevanshi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kshirsagar143");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		// driver.close();
		System.out.println("Cases Are Success..");

	}

}
