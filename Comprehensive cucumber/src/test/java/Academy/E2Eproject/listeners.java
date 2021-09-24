package Academy.E2Eproject;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class listeners implements ITestListener {
	
	@Override
	public void onTestStart (ITestResult passed)
	{
		System.out.println("Passed Listener");
		
	}

	@Override
	public void onTestFailure (ITestResult result)
	{
		Base b= new Base();
		//screenshot
		try {
			Base.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped (ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	
	@Override
	public void onTestSuccess (ITestResult passed)
	{
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
