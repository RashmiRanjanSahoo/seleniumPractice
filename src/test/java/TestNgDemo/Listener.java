package TestNgDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
  
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        System.out.println("onFinish");	        		
	    }		
	    @Override		
	    public void onStart(ITestContext arg0) {					
	    	System.out.println("onStart");				  		
	    }		
	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        System.out.println("onTestFailedButWithinSuccessPercentage");					
	    }	
	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	        System.out.println("onTestFailure");				       		
	    }		
	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	       System.out.println("onTestSkipped");				        		
	    }		
	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	       System.out.println("onTestStart");				        		
	    }		
	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        System.out.println("onTestSuccess");					        		
	    }		
}

