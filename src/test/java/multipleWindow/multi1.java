package multipleWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multi1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("(//div[@class='widget-content']/p/a)[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"selenium143\"]")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			String txt = driver.findElement(By.xpath(
					"/html/body/div[5]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div[2]/div[1]/table/tbody/tr/td[1]/ol/li[1]/b/a"))
					.getText();
			System.out.println(txt);
		}
	}

}
