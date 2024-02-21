package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/hgf-c360nav//header/div[1]/div[1]/nav[2]/div/hgf-button//a"))
				.click();

	}

}
