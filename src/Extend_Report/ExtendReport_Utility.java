package Extend_Report;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport_Utility implements ITestListener {
	
	public ExtentSparkReporter sparkreport;
	public ExtentReports reports;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		sparkreport = new ExtentSparkReporter(System.getProperty("user.dir")+"/Gen_Extent_Report/Report.html");
		sparkreport.config().setDocumentTitle("FirstReport");
		sparkreport.config().setReportName("Functional Testing");
		sparkreport.config().setTheme(Theme.DARK);
		
		
		reports = new ExtentReports();
		reports.attachReporter(sparkreport);
		reports.setSystemInfo("Computer host = ", "localHost");
		reports.setSystemInfo("Environment = ", "UAT");
		reports.setSystemInfo("Tester Name =", "Gitesh Patil");
		reports.setSystemInfo("BrowserName = ", "Chrome");
	}
		
		public void onTestSuccess(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.log(Status.PASS, "Test is passed - "+result.getName());
			
		}
		public void onTestFailure(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.log(Status.FAIL, "Test is failed - "+result.getThrowable());
		}
		
		public void onTestSkipped(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.log(Status.SKIP, "This Test was Skipped - "+result.getName());
		}
		
		public void onFinish(ITestContext context)
		{
			reports.flush();
		}
		
	
	
	
	
	

}
