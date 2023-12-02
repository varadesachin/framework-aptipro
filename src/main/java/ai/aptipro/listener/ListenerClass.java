package ai.aptipro.listener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import ai.aptipro.extentReports.ExtentReportClass;
import ai.aptipro.utils.CaptureScreenShot;

public class ListenerClass implements ITestListener {
	
	ExtentReports extent;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		extent = ExtentReportClass.getReports();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName()+" has started successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName());
		test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenShot.captureScreenShotInBase64(), " Failed Testcase ScreenShot").build());
		test.log(Status.INFO, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName());
		test.log(Status.INFO, result.getThrowable());
	}

	

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	

}
