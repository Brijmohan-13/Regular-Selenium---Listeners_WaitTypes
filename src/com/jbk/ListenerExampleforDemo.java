package com.jbk;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExampleforDemo implements ITestListener
////this class will act as a listener since it implements ITestListener
////this class is written in Testing1  class under the same package....i.e applied in Testing1 class
///ListenerExampleforDemo class will listen all test cases of Testing1 class


{
	@Override
	public void onTestStart(ITestResult result) {
		//here result object of ITestResult interface
		System.out.println("Test case Started with name"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case succeeded with name"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case Failed with name"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case Skipped with name"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
