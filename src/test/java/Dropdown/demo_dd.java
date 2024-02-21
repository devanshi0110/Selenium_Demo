package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_dd {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();

//		WebElement d1 = driver.findElement(By.xpath("//div[@id=\"demo_basic-dropdown\"]"));
//		d1.click();	
//		driver.findElement(By.xpath("(//button[@data-value=\"2\"])[1]")).click();

//		WebElement d2 = driver.findElement(By.xpath("//div[@id='demo_groups-dropdown']"));
//		d2.click();	
//		driver.findElement(By.xpath("(//button[@data-value='8'])[1]")).click();

//		WebElement d3 = driver.findElement(By.xpath("//div[@id='demo_multiple-dropdown']"));
//		d3.click();	
//		driver.findElement(By.xpath("(//button[@data-value='6'])[2]")).click();
//		driver.findElement(By.xpath("(//button[@data-value='8'])[2]")).click();

		driver.findElement(By.xpath("//button[@id='demo_cover-dropdown-selected']")).click();
		driver.findElement(By.xpath("(//button[@data-value='4'])[3]")).click();
	}

}
