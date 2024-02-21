package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookie_handle {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// get All cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies : " + cookies.size());

		/*
		 * for(Cookie cookie : cookies) { System.out.println(cookie.getName() + " : " +
		 * cookie.getValue()); }
		 */

		// get specific cookie
		System.out.println(driver.manage().getCookieNamed("session-id"));

		// add cookie
		Cookie obj = new Cookie("mydcookie", "Devanshi Kshirsgar");
		driver.manage().addCookie(obj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		// delete cookie by cookie obj
		driver.manage().deleteCookie(obj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		// delete cookie by name
		driver.manage().deleteCookieNamed("session-id");
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		// delete all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
	}

}
