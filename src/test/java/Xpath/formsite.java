package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class formsite {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-1']")).sendKeys("Devanshi");
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-2']")).sendKeys("Kshirsagar");
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-3']")).sendKeys("9825634152");
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-4']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-5']")).sendKeys("Surat");
		driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-6']")).sendKeys("devanshi@gmail.com");
		//driver.findElement(By.id("RESULT_RadioButton-7_0"));
		WebElement test=driver.findElement(By.id("RESULT_RadioButton-7_1"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", test);
		
		
		WebElement check=driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_2\"]"));
		js.executeScript("arguments[0].click();", check);
		WebElement check1=driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_4\"]"));
		js.executeScript("arguments[0].click();", check1);
		WebElement check2=driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_6\"]"));
		js.executeScript("arguments[0].click();", check2);
		
		
		
		WebElement down=driver.findElement(By.name("RESULT_RadioButton-9"));
		Select select=new Select(down);
		select.selectByIndex(2);
		
		String filepath="/home/staah/Screenshot from 2024-01-09 11-09-14.png";
		WebElement file=driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-10\"]"));
		file.sendKeys(filepath);
		driver.findElement(By.xpath("//input[@id='FSsubmit']")).click();
		System.out.println("Done");

	}

}
