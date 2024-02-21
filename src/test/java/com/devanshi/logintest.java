package com.devanshi;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintest {

	public static void sysout(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("password"));
		org.openqa.selenium.Point point = element.getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);

//		driver.findElement(By.id("user-name")).sendKeys("error_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();
//		Sysout("Cases Are Success..");

//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://m.facebook.com/login/?locale=en_GB	");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("m_login_email")).sendKeys("error_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();
//		Sysout("Cases Are Success..");

	}

}
