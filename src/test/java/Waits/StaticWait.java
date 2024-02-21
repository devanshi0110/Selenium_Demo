package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//li[@data-currenttabindex='2']/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mattresses']")).click();

	}

}
