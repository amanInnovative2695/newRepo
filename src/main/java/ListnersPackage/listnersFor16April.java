package ListnersPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnersFor16April implements ITestListener {
	public  void onTestStart(ITestResult result) {
	    System.out.println("my method has been started");
	  }
	
	public void onTestSuccess(ITestResult result) {
	   System.out.println("my method has been passed");
	  }
	
	
	public void onTestFailure(ITestResult result) {
		   System.out.println("my test has been failed");
		  }
	 
	 
	public void onStart(ITestContext context) {
		    System.out.println("my class has been started to execute");
		  }

}
