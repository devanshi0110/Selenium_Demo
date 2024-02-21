package web_calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
//		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		while(!(month.equals("February") && (year.equals("2025")))) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		}
//		driver.findElement(By.xpath("//a[text()='28']")).click();
		
//		driver.findElement(By.id("datepicker2")).click();
//		String month = driver.findElement(By.xpath("(//option[@selected='selected'])[1]")).getText();
//		String year = driver.findElement(By.xpath("(//option[@selected='selected'])[2]")).getText();
//		
//		System.out.println(month + " : " + year);
//		while(!(month.equals("October")&&(year.equals("2025")))) {
//			driver.findElement(By.xpath("//a[@class='datepick-cmd datepick-cmd-next ']")).click();
//			month = driver.findElement(By.xpath("(//option[@selected='selected'])[1]")).getText();
//			year = driver.findElement(By.xpath("(//option[@selected='selected'])[2]")).getText();
//		}
//		driver.findElement(By.xpath("//a[text()='22']")).click();
//		
//		 month = driver.findElement(By.xpath("(//option[@selected='selected'])[1]")).getText();
//		 year = driver.findElement(By.xpath("(//option[@selected='selected'])[2]")).getText();
//		Thread.sleep(5000);
//		System.out.println(month + " : " + year);
		
		
		driver.get("http://primefaces.org/showcase/ui/input/datepicker/datePicker.xhtml?jfwid=823e7");
		driver.findElement(By.id("form:basic_input")).click();
		String month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText();
		String year = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText();
		System.out.println(month + " : " + year);
		while(!(month.equals("October") && (year.equals("2025")))) {
			driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[2]")).click();
			month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText();
			year = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText();
		}
		driver.findElement(By.xpath("(//a[text()='28'])[2]")).click();
		System.out.println(month + " : " + year);
	}

}
