package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		driver.findElement(By.xpath("//input[@name='First_Name']")).sendKeys("Devanshi");
		driver.findElement(By.xpath("//input[@name='Last_Name']")).sendKeys("K'Sagar");
		driver.findElement(By.xpath("//input[@name='Email_Id']")).sendKeys("devanshi@gmail.com");
		driver.findElement(By.xpath("//input[@name='Mobile_Number']")).sendKeys("9328689120");
		WebElement element = driver.findElement(By.xpath("//input[@value='Female']"));
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//textarea[@name='Address']")).sendKeys("Bhestan");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@name='Pin_Code']")).sendKeys("395023");
		driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Gujarat");

		WebElement chk1 = driver.findElement(By.xpath("//input[@value='Drawing']"));
		js.executeScript("arguments[0].click();", chk1);
		WebElement chk2 = driver.findElement(By.xpath("//input[@value='Sketching']"));
		js.executeScript("arguments[0].click();", chk2);

		WebElement bca = driver.findElement(By.xpath("//input[@name='BCA']"));
		js.executeScript("arguments[0].click();", bca);

		driver.findElement(By.xpath("//input[@name='ClassX_Board']")).sendKeys("GSEB");
		driver.findElement(By.xpath("//input[@name='ClassXII_Board']")).sendKeys("GHSEB");
		driver.findElement(By.xpath("//input[@name='Graduation_Board']")).sendKeys("GHSEB");
		driver.findElement(By.xpath("//input[@name='Masters_Board']")).sendKeys("GHSEB");

		driver.findElement(By.xpath("//input[@name='ClassX_Percentage']")).sendKeys("84%");
		driver.findElement(By.xpath("//input[@name='ClassX_Percentage']")).sendKeys("88%");
		driver.findElement(By.xpath("//input[@name='Graduation_Percentage']")).sendKeys("84%");
		driver.findElement(By.xpath("//input[@name='Masters_Percentage']")).sendKeys("Pursuing");

		driver.findElement(By.xpath("//input[@name='ClassX_YrOfPassing']")).sendKeys("2017");
		driver.findElement(By.xpath("//input[@name='ClassXII_YrOfPassing']")).sendKeys("2019");
		driver.findElement(By.xpath("//input[@name='Graduation_YrOfPassing']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='Masters_YrOfPassing']")).sendKeys("2024");

		WebElement day = driver.findElement(By.xpath("//*[@id='Birthday_Day']"));
		Select d = new Select(day);
		d.selectByIndex(10);

		WebElement month = driver.findElement(By.xpath("//*[@id='Birthday_Month']"));
		Select m = new Select(month);
		m.selectByIndex(10);

		WebElement year = driver.findElement(By.xpath("//*[@id=\"Birthday_Year\"]"));
		Select y = new Select(year);
		y.selectByIndex(12);

		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		js.executeScript("arguments[0].click();", submit);
//		WebElement reset=driver.findElement(By.xpath("//input[@value='Reset']"));
//		js.executeScript("arguments[0].click();", reset);

	}

}
