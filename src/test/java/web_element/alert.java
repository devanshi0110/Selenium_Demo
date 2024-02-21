package web_element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {

		// alert
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driver.manage().window().maximize();	
//		WebElement element = driver.findElement(By.xpath("//*[@id='iframeResult']"));
//		driver.switchTo().frame(element);
//		driver.findElement(By.xpath("/html/body/button")).click();		
//		String txt = driver.switchTo().alert().getText();
//		System.out.println(txt);
//		driver.switchTo().alert().accept();
//		driver.switchTo().parentFrame();
//		System.out.println(driver.getTitle());

		// prompt
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id='iframeResult']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("/html/body/button")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Devanshi Kshirsagar");
		Thread.sleep(2000);
		alert.accept();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

	}

}
