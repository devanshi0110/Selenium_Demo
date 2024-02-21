package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='item_4_img_link']/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		// driver.close();

	}

}
