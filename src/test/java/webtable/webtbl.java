package webtable;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtbl {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table02']/tbody/tr"));
		System.out.println("Number of Rows : " + rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"table02\"]/thead/tr/th"));
		System.out.println("Number of Cols : " + cols.size());

		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j < cols.size(); j++) {
				System.out.println(
						driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()
								+ " ");
			}
			System.out.println();
		}

	}

}
