package Forms;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class vnsgu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://vnsgu.net/");
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("2022026082");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9328689120");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(), \"College / Department Management\")]"));
		ele.click();

		WebElement e = driver.findElement(By.xpath("//select[@name=\"ctl00$ContentPlaceHolder1$ddlSemester1\"]"));
		e.click();
		Select se = new Select(e);
		se.selectByIndex(2);

		driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_lnkMarkSheet']/img")).click();

		WebElement e1 = driver.findElement(By.xpath("//span[@id='select2-ContentPlaceHolder1_ddlExamName-container']"));
		e1.click();

		driver.findElement(By.xpath(
				"//li[contains(text(), \"MASTER OF SCIENCE (INFORMATION & COMMUNICATION TECHNOLOGY) (THIRD SEMESTER) NOVEMBER - 2023\") ]"))
				.click();
		// driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("MASTER
		// OF SCIENCE (INFORMATION & COMMUNICATION TECHNOLOGY) (THIRD SEMESTER) NOVEMBER
		// - 2023");

		driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_lnkbtnMarksheet']")).click();

	}

}