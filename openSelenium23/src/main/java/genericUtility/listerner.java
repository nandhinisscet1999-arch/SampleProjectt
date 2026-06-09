package genericUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listerner  implements ITestListener,ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("OnStart IS");;
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("OnFinish IS");;
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Onteststart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ontestsuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		System.out.println(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("OnStart of context");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Onfisnish of context");
	}
	
}
