package web_calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {
	public void demo() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='first_date_picker']")).click();

		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!(year.equals("2024") && month.equals("October"))) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		driver.close();
	}
	
	public void demo1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='second_date_picker']")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!(year.equals("2024") && month.equals("October"))) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		driver.close();
	}

	public void demo2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='third_date_picker']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(month);
		select.selectByValue("9");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1 = new Select(year);
		select1.selectByValue("2023");
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
	
		
	}

	public void demo3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='fourth_date_picker']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(month);
		select.selectByValue("9");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1 = new Select(year);
		select1.selectByValue("2023");
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
	}
	
	public void demo4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='fifth_date_picker']")).click();

		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!(year.equals("2024") && month.equals("February"))) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		driver.close();
	}

	public void demo5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='sixth_date_picker']")).click();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!(year.equals("2024") && month.equals("October"))) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		driver.close();
	}
	public static void main(String[] args) {
		calender c = new calender();
		c.demo5();
	}
	
	
}
