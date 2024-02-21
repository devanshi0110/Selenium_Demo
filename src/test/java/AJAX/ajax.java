package AJAX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ajax {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver; // cast the driver as JavascriptExecutor
		WebElement element = driver.findElement(By.xpath("(//div[@id='myDropdown']/a)[1]"));
		js.executeScript("arguments[0].click ();", element);
//		//Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@id='myDropdown']/a)[1]")).click();

	}

}
