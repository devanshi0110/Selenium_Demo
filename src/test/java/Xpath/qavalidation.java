package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class qavalidation {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://qavalidation.com/demo-form/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//*[@id=\'g4072-fullname\']")).sendKeys("Devanshi K'Sagar");
		driver.findElement(By.xpath("//*[@id='g4072-email']")).sendKeys("devanshi@gmail.com");
		driver.findElement(By.xpath("//*[@id='g4072-phonenumber']")).sendKeys("9875365210");

//		WebElement down = driver.findElement(By.xpath("(//select[@class=\"select  grunion-field contact-form-dropdown\"])[1]"));
//		System.out.println("Test");
//		Select select = new Select(down);
//		select.selectByVisibleText("Female");

		WebElement test = driver.findElement(By.xpath("//*[@name='g4072-yearsofexperience' and @value=1]"));
		js.executeScript("arguments[0].click();", test);

		// WebElement check1=driver.findElement(By.xpath("//*[@name='g4072-skills[]' and
		// @value='Functional testing']s"));
		// js.executeScript("arguments[0].click();", check1);

		// WebElement down1 = driver.findElement(By.xpath("//*[@id='g4072-qatools']"));
		// js.executeScript("arguments[0].click();", down1);
		// Select select = new Select(down);
		// select.selectByIndex(2);

		driver.findElement(By.xpath("//*[@id='contact-form-comment-g4072-otherdetails']")).sendKeys("Ok Bye");
		driver.findElement(By.xpath("//div[@class='wp-block-jetpack-button wp-block-button']/button")).click();

	}

}
