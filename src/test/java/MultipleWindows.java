import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String parenthandles = driver.getWindowHandle();
		System.out.println("Parent Window:-" + parenthandles);

		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parenthandles)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("vandana");
				Thread.sleep(2000);
				driver.close();

			} else if (!handle.equals(parenthandles)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name='fName']")).sendKeys("vandana");
				Thread.sleep(2000);
				driver.close();

			}
		}
		driver.switchTo().window(parenthandles);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vandana");
		Thread.sleep(2000);

	}

}