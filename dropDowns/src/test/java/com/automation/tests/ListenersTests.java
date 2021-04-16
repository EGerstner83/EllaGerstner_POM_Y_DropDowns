/*
 * This class you can find the listeners used and message to know what happened
 * */
package com.automation.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTests implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("The test case started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Success of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Skip of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : " + result.getName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }


    @Override
    public void onFinish(ITestContext context) {
// TODO Auto-generated method stub
    }

}
