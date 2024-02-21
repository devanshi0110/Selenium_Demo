package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement txtUsername = driver.findElement(By.xpath("//*[@id='email']"));

		Actions builder = new Actions(driver);
		builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build().perform();  
	}

}
