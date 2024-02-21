package CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class cross_browser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		String browserName = "fierfox";
		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("fierfox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Provide Specific Browser name");
		}

		driver.get("https://www.goinglobal.com/demo-registration-form-february-8-2024-200-pm-edt");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='edit-submitted-name']")).sendKeys("Dityaa");
		driver.findElement(By.xpath("//*[@id='edit-submitted-phone']")).sendKeys("9601125630");
		driver.findElement(By.xpath("//*[@id='edit-submitted-organization-university']")).sendKeys("VNSGU");
		driver.findElement(By.xpath("//*[@id='edit-submitted-department']")).sendKeys("ICT");
		driver.findElement(By.xpath("//*[@id='edit-submitted-title']")).sendKeys("Demo");
		driver.findElement(By.xpath("//*[@id='edit-submitted-e-mail-address']")).sendKeys("dityaa@gmail.com");
		driver.findElement(By.xpath("//*[@id='edit-submitted-comments']")).sendKeys("Nice");

		driver.findElement(By.xpath("//div[@class='form-actions']/input")).click();

	}

}
