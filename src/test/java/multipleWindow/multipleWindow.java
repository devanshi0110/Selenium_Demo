package multipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWindow {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		// open window in new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Devanshi KShirsagar");

		// open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
	}

}
