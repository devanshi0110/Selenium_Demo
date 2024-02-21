package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class auto_complete_dd {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='From']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mubmai");
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

	}

}
