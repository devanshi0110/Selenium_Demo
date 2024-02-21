package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tbl {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa.");

		// No of Columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		int columnCount = columns.size();
		System.out.println("No of columns in a table : " + columnCount);

		// No of Rows

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("No of rows in a table : " + rowCount);
		driver.close();

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= columnCount; j++) {
				String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(cellValue + "  ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
