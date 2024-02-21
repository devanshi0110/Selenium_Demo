package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demotest {
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","/home/staah/Downloads/chromedriver_linux64");
		// ChromeDriver dd= new ChromeDriver();
		// dd.get("https://google.com");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();

	}
}
