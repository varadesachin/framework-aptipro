package ai.aptipro.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public final class ExtentReportClass {
	
	private ExtentReportClass() {}
	
	public static ExtentReports getReports() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReports\\reports.html");
		extent.attachReporter(spark);
		return extent;
	}
}
