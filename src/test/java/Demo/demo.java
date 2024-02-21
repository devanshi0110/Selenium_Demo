package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_f901fbbd6b7bf8368fa2805b635547a4a0e678c65d4ba484ab53ccc9&mfadid=adm");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile");

		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

		WebDriver driver2 = new FirefoxDriver();
		// driver2.get("https://www.amazon.in/s?k=Mobile&ref=nb_sb_noss");
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

	}

}
