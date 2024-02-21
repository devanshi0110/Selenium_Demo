package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gla {

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://myglaonline.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhishek@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhi123");

		driver.findElement(By.xpath("//div[@class=' css-khl8b7-container']")).click();

		driver.findElement(By.xpath("//div[@class=' css-1dimb5e-singleValue' and text()='Faculty']")).click();

	}

}
