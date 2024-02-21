package web_calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.madbob.org/cc/demo.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.close();
		
	}

}
