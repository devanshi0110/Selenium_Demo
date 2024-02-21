package web_calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		 	WebDriver driver = new FirefoxDriver();
	        driver.get("http://omayo.blogspot.com/");
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        Thread.sleep(3000);
			WebElement l = driver.findElement(By.xpath("(//button[@id='button9'])[1]"));
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150);");
			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150);");
			l.click();
	}

}
