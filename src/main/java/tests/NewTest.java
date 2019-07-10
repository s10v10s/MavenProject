package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	public WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get(
				"https://accounts-dev.netgear.com/login?redirectUrl=https:%2F%2Fsampleapp1.accounts-qa.netgear.com%2F");
		String str = driver.findElement(By.id("Login-btn")).getText();
		Listner list = new Listner();
		list.reportPass("Test Pass", "string test" + str);
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