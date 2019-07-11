package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Listner;

public class NewTest {

	public WebDriver driver;
	Listner list1; 

	@Test
	public void openMyBlog() {
		try {
			driver.get(
					"https://accounts-dev.netgear.com/login?redirectUrl=https:%2F%2Fsampleapp1.accounts-qa.netgear.com%2F");
			Thread.sleep(30000);
			String str = driver.findElement(By.id("Login-btn")).getText();
			System.out.println(str);
			list1= new Listner();
			list1.reportPass("Heyy", "Hyy bro" + str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
