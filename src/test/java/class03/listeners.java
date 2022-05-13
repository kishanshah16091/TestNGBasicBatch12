package class03;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {
    @Override

    public void onTestFailure(ITestResult result){
        System.out.println("the test case that failed is ::"+result.getName());

    }
@Override
    public void onTestSuccess(ITestResult result){
    System.out.println("the test case that passed is ::"+result.getName());
}

}
