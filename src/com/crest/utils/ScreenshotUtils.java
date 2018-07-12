package com.crest.utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ScreenshotUtils implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String className=result.getMethod().getRealClass().getSimpleName();
		String methodName=result.getMethod().getMethodName();
		Object testClassInstance=result.getInstance();
		WebDriver driver=((BrowserUtil) testClassInstance).driver;
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		DateFormat currentDateAndTime=new SimpleDateFormat("dd-MMM-yyyy__hh.mm.ssaa");
		try {
			
			String screenshotPath=System.getProperty("user.dir")+("//Failure//"+className+"_"+methodName+"_"+currentDateAndTime.format(new Date())+".png").replace("/", File.separator);
			FileUtils.copyFile(screenshot, new File(screenshotPath));
			Reporter.log("<a href="+screenshotPath+">Screenshot</a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
