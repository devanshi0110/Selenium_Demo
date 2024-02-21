package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asx.com.au/");

		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[1]/tr"));
		System.out.println("Total No Of Rows :" + rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[1]/tr/th"));
		System.out.println("Total No Of Columns :" + cols.size());

		for (int i = 0; i < rows.size(); i++) {
			for (int j = 0; j < cols.size(); j++) {
				System.out.println(driver
						.findElement(By.xpath(
								"(//table[@class='md-bootstrap-tooltip'])[1]/tr[" + (i + 1) + "]/td[" + (j + 1) + "]"))
						.getText());
			}
		}

	}

}
