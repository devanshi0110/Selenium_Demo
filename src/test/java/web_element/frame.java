package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[@id='iframeResult']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

	}

}
