package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='likeit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[6]")).click();

	}

}
