package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryUtils implements IRetryAnalyzer {
    private int count = 0;
    private static final int maxTry = 2; // This will try the test 2 extra times

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (count < maxTry) {
                count++;
                return true; // Tells TestNG to retry
            }
        }
        return false;
    }
}