package AJAX;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ajax2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("a");

		Actions action = new Actions(driver);
//		

//		driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();

		List<WebElement> value = driver.findElements(By.xpath("//*[starts-with(@id,'ui-id')]"));
		Iterator<WebElement> it = value.iterator();

		while (it.hasNext()) {
			WebElement e = it.next();
			if (e.getText().equalsIgnoreCase("asp")) {
				e.click();
			} else {

				driver.findElement(By.xpath("//input[@id='tags']")).clear();
				driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("d");
				action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
			}

		}

	}

}
