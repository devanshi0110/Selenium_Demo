package ValidationCommand;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class validation {
	
	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean isDisplayed = driver.findElement(By.xpath("//span[@class='_9zlu _aah_']/..")).isDisplayed();
//		Assert.assertTrue(isDisplayed, "This Element not displayed");
//		System.out.println("Display  :"  +isDisplayed);
		boolean enable  = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		Assert.assertTrue(isDisplayed);
		//System.out.println("Enable  :"  + enable);
//		driver.findElement(By.name("emailOrPhone")).sendKeys("devanshi@gmail.com");
//		driver.findElement(By.name("fullName")).sendKeys("devanshi@gmail.com");
//		driver.findElement(By.name("username")).sendKeys("devanshi@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("devanshi@gmail.com");
//		
//		enable  = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
//		System.out.println("Enable  :"  + enable);
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.classy.org/sso");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean selected = driver.findElement(By.name("remember_me")).isSelected();
		System.out.println("Selected : " +selected);
		WebElement check=driver.findElement(By.name("remember_me"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", check);
		Thread.sleep(5000);
		selected = driver.findElement(By.name("remember_me")).isSelected();
		System.out.println("Selected : " +selected);
		driver.close();
	}
}
