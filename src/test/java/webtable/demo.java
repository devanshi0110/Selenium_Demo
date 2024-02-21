package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa.");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(cols.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(row.size());
		
		for(int i=1;i<=row.size();i++) {
			for(int j=1;j<=cols.size();j++) {
				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td[" + j +"]")).getText();
				System.out.println(value);
			}
		}
	}

}
