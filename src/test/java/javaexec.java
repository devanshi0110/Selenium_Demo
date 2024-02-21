import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaexec {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.title;";
		System.out.println(js.executeScript(script));

		driver.switchTo().frame("iframeResult");
//        js.executeScript("myFunction()");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		WebElement btn = driver.findElement(By.xpath("/html/body/button"));
		js.executeScript("arguments[0].style.border='5px solid green'", btn);

		driver.navigate().to("https://www.w3schools.com/");
		WebElement a = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/div/div[1]/a[3]"));
		js.executeScript("arguments[0].scrollIntoView(true);", a);

	}

}
