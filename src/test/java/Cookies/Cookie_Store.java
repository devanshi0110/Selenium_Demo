package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookie_Store {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");

//        Set <Cookie> cookies = driver.manage().getCookies();
//        System.out.println("Size of Cookie : " + cookies.size());
//        for(Cookie cookie : cookies) {
//        	System.out.println(cookie.getName() +" : "+ cookie.getValue());
//        }
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Devanshi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Devanshi");
		driver.findElement(By.name("submit")).click();

		File file = new File("cookies.data");
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			for (Cookie c : driver.manage().getCookies()) {
				bwriter.write((c.getName() + " : " + c.getValue() + " : " + c.getPath() + " : " + c.getExpiry()));
			}
			bwriter.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
