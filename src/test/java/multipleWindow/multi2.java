package multipleWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multi2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		String parent = driver.getWindowHandle();
		System.out.println("Parent: " + parent);

		WebElement google = driver.findElement(By.xpath("(//a[@name='link1'])[2]"));
		google.click();

		WebElement facebook = driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]"));
		facebook.click();

		Set<String> allWindows = driver.getWindowHandles();
		for (String child : allWindows) {
			if (!parent.equals(child)) {

				driver.switchTo().window(child);
				try {
					if (driver.getCurrentUrl().contains("google")) {
						Thread.sleep(3000);
						driver.findElement(By.name("q")).sendKeys("Devanshi");
						Thread.sleep(3000);
					} else if (driver.getCurrentUrl().contains("facebook")) {
						driver.findElement(By.id("email")).sendKeys("kshirsagardevanshi@gmail.com");
					}
					Thread.sleep(3000);
					driver.close();
					driver.switchTo().window(parent);

				} catch (Exception e) {
					System.out.println("Not Found");
				}
			}
		}
	}
}