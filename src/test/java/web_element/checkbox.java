package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://demoqa.com/checkbox");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://formstone.it/components/checkbox/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[4]")).click();

	}

}
