package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("execution started"+ result.getName() );
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execution passed :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Execution Failed : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Execution Skipped : "+result.getName());
	}

	

}
