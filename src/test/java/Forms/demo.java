package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"single-input-field\"]")).sendKeys("Hello From Devanshi..");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-one\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"value-a\"]")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"value-b\"]")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-two\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gridCheck\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"check-box-two\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"check-box-four\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-two\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inlineRadio2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-one\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inlineRadio21\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inlineRadio23\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-two\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[4]")).click();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
		Select select = new Select(ele);
		select.selectByIndex(2);
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"multi-select-field\"]"));
		Select select1 = new Select(ele1);
		select1.selectByIndex(2);
		Thread.sleep(1000);
		select1.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-first\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-all\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustom01\"]")).sendKeys("Devanshi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustom02\"]")).sendKeys("Kshirsagar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustomUsername\"]")).sendKeys("devanshi0110");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustom03\"]")).sendKeys("Surat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustom04\"]")).sendKeys("Gujarat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"validationCustom05\"]")).sendKeys("395023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"invalidCheck\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Automation testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"description\"]"))
				.sendKeys("Automation Testing using Selenium,java etc..");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//li[@class='list-group-item']/a)[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("or");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/span/span[1]/span"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/form/div/span/span[1]/span/span[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("ha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

}
