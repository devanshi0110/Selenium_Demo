package web_calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='datepicker']")).click();

		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!(month.equals("October") && year.equals("2001"))) {

			//driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();

	}

}
