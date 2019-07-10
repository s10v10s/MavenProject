package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	public WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("https://www.google.com/search?q=uikh&ie=utf-8&oe=utf-8&client=firefox-b-ab");

	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");

		driver = new FirefoxDriver();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}