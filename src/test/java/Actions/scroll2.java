package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll2 {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.ebay.com.au/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)");	
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-250)");	
		
//        WebDriver driver = new FirefoxDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;	
//        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");	
//        WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));		
//        js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		driver.get("https://ingmarh.github.io/scroll-shadow-element/demo/");
		
	}

}

