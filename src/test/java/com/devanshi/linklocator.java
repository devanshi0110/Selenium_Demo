package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linklocator {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/documentation/grid/");
		driver.manage().window().maximize();
		// driver.findElement(By.linkText("Overview")).click();
		driver.findElement(By.partialLinkText("Over")).click();
		// driver.close();
		System.out.println("Cases Are Success..");

	}

}
