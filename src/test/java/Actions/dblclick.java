package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dblclick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		driver.manage().window().maximize();

		WebElement clickele = driver.findElement(By.xpath("//*[@id='box']"));
		Actions action = new Actions(driver);
		action.click(clickele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().refresh(); // refresh the web page
		clickele = driver.findElement(By.xpath("//*[@id='box']"));
		Thread.sleep(2000);
		action.doubleClick(clickele).perform();
	}

}
