package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_select {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//*[@id='course']"));
		Select select = new Select(ele);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("js");
		Thread.sleep(2000);
		select.selectByVisibleText("Java");

		WebElement d2 = driver.findElement(By.xpath("//*[@id=\"ide\"]"));
		Select select1 = new Select(d2);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		select1.selectByValue("ec");
		Thread.sleep(2000);
		select1.selectByVisibleText("NetBeans");

	}

}
