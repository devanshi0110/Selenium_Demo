package com.devanshi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicmethods {

	public static void sysout(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {

		// define driver
		WebDriver driver = new FirefoxDriver();
		// get(); method
		driver.get("http://www.saucedemo.com");

		// findelement
		driver.findElement(By.id("user-name")).sendKeys("error_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		// driver.close();
		sysout("Cases Are Success..");

		// findelements
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_list\']/div"));
		System.out.println(ele);

		driver.navigate().to("https://www.sugarcrm.com/au/?utm_source=google.com&utm_medium=organic");
		String s = driver.getWindowHandle();
		sysout(s);

		// manage() maximize and minimize window
		driver.manage().window().maximize();

		// getcurrenturl()
		String cuurl = driver.getCurrentUrl();
		sysout(cuurl);

		// gettitle()
		String title = driver.getTitle();
		sysout(title);

		// getpageresource()
		String res = driver.getPageSource();
		sysout(res);

		// navigate
		// driver.navigate().to("http://www.ebay.com");

//	driver.close();
//	driver.quit();
//	

	}

}
