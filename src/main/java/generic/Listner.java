package generic;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Listner {
	
	



		ExtentReports extent;
		ExtentHtmlReporter reporter;
		ExtentTest logger;

		public Listner() {

			reporter = new ExtentHtmlReporter("./jenkins.html");
			reporter.setAppendExisting(true);
			extent = new ExtentReports();

		}

		/*
		 * public void reportPass(String testName) // ( String testName, String //
		 * category) {
		 * 
		 * // ExtentReports extent = new ExtentReports();
		 * extent.attachReporter(reporter); ExtentTest logger =
		 * extent.createTest(testName); // logger.assignCategory(category); //
		 * logger.log(Status.INFO, testcase1); logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Pass", ExtentColor.GREEN)); extent.flush(); }
		 */

		public void reportPass(String testName, String category) // ( String
																	// testName,
																	// String
																	// category)
		{

			// ExtentReports extent = new ExtentReports();
			extent.attachReporter(reporter);
			ExtentTest logger = extent.createTest(testName);
			// logger.assignCategory(category);
			logger.log(Status.INFO, category);
			logger.log(Status.PASS, MarkupHelper.createLabel("Pass", ExtentColor.GREEN));
			extent.flush();
		}

		public void reportFail(String testName, String category)// ( String
																// testName, String
																// category)
		{

			extent.attachReporter(reporter);

			ExtentTest logger2 = extent.createTest(testName);
			// logger2.log(Status.INFO, MarkupHelper.createLabel("Sun",
			// ExtentColor.BLUE));
			// logger2.assignCategory(category);
			logger2.log(Status.INFO, category);
			logger2.log(Status.FAIL, MarkupHelper.createLabel("Fail", ExtentColor.RED));
			extent.flush();

		}
	}

