package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewTest {

	public WebDriver driver;
	Listner list = new Listner();

	@Test
	public void openMyBlog() {
		try {
			driver.get(
					"https://accounts-dev.netgear.com/login?redirectUrl=https:%2F%2Fsampleapp1.accounts-qa.netgear.com%2F");
			String str = driver.findElement(By.id("Login-btn")).getText();
			System.out.println(str);
			list.reportPass("Heyy", "Hyy bro" + str);

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