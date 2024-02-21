package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/checkbox-and-radio-button-webdriver.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='kt-inside-inner-col']/a)[1]"));
		Actions action = new Actions(driver);
	//	action.moveToElement(ele).perform();
//		ele.sendKeys(Keys.ARROW_DOWN);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");

	}

}
