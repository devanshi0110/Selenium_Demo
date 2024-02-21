package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class d1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//select"));
		Select select = new Select(ele);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("BOL");
		Thread.sleep(3000);
		select.selectByVisibleText("India");

	}

}
