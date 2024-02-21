package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class codenbox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='nf-field-17']")).sendKeys("Devanshi");
		driver.findElement(By.xpath("//*[@id='nf-field-18']")).sendKeys("Kshirsagar");

		driver.findElement(By.xpath("//*[@id='nf-field-19']")).sendKeys("dev@gmai.com");
		driver.findElement(By.xpath("//*[@id='nf-field-20']")).sendKeys("9658231241");

		WebElement course = driver.findElement(By.xpath("//*[@id='nf-field-22']"));
		Select c = new Select(course);
		c.selectByIndex(6);

		WebElement month = driver.findElement(By.xpath("//*[@id='nf-field-24']"));
		Select m = new Select(month);
		m.selectByIndex(3);

		WebElement radio = driver.findElement(By.xpath("//*[@id='nf-field-23-1']"));
		// radio.click();
		js.executeScript("arguments[0].click();", radio);

		driver.findElement(By.xpath("//*[@id='nf-field-15']")).click();

	}

}
