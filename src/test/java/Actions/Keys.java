package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		Actions action = new Actions(driver);
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line ']/span)[5]"));
		action.keyDown(ele, org.openqa.selenium.Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		WebElement ele2 = driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[17]"));
		action.keyDown(ele2, org.openqa.selenium.Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}
