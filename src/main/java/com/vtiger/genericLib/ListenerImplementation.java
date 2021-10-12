package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
		System.out.println("Screenshot capturing starts");
		String name=result.getName();
		EventFiringWebDriver efwd=new EventFiringWebDriver(BaseClass.monitorDriver);
		File actualScreenshot=efwd.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(actualScreenshot, new File("./screenshot/ "+name+" .png"));
		}catch(IOException e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Screenshot capturing ends");
		
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
