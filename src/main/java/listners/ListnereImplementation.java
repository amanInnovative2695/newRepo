package listners;

import java.awt.event.ItemListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnereImplementation implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
	   System.out.println("next method has been started");
	  }
	
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("test has been passed");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    System.out.println("test has been failed");
		    
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }
	 
	 public void onStart(ITestContext context) {
		   System.out.println("Test hSa been started");
		  }
	 
	 
	 public void onFinish(ITestContext context) {
		    // not implemented
		  }

}
