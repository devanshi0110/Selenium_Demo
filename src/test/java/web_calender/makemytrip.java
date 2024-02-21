package web_calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytrip {

    public void mkp() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        String flag = "False";
        while (flag.equals("False")) {
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Oct 01 2024')]"))
                    .size() > 0) {
                driver.findElement(
                        By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Oct 01 2024')]")).click();
                flag = "True";
            } else {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"))
                        .click();
            }
        }
    }

    public void singaporeflights() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.singaporeair.com/en_UK/in/home?mjid=636768#/book/bookflight");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='departDate1']")).click();
        String flag = "false";
        while (flag.equals("false")) {
            if (driver.findElements(By.xpath("//li[@date-data='2024-04-01']")).size() > 0) {
                WebElement date = driver.findElement(By.xpath("//li[@date-data='2024-04-01']"));
                js.executeScript("arguments[0].click();", date);
                flag = "true";
            } else {
                // Use WebDriverWait to wait for the obscuring element to be clickable or disappear
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement obscuringElement = driver.findElement(By.cssSelector("button.dwc--SiaCookie__PopupBtn"));
                wait.until(ExpectedConditions.invisibilityOf(obscuringElement));

                driver.findElement(By.xpath("//div[@class='months-text']/a")).click();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        makemytrip m = new makemytrip();
        m.singaporeflights();
    }
}