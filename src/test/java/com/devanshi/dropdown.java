package com.devanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void sysout(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();

		WebElement down = driver.findElement(By.name("continents"));
		Select select = new Select(down);

		// select.selectByIndex(4);
		// select.selectByValue(null);
		// select.selectByVisibleText("Europe");
	}

}
