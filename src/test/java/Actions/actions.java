package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		// click()
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// click(target)
		WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		Actions action = new Actions(driver);
		action.click(element).perform();

		// clickandhold() and release()
		WebElement link1 = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
		action.clickAndHold(link1).perform();
		action.release(link1);

	}

}
