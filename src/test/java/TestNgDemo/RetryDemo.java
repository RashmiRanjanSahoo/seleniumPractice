package TestNgDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryDemo implements IRetryAnalyzer {
 private int retryCount=0;
 private int maxRetryCount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
