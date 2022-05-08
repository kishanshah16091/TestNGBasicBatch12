package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test
    public void firstTest() {
        System.out.println("This is my first testcase");

    }

    @Test
    public void secondTest() {
        System.out.println("This is my second testcase");
    }

    @Test
    public void thirdTest() {
        System.out.println("This is my third testcase");
    }

    @BeforeMethod

    public void beforeMethod() {
        System.out.println("************ I am Precondition *************");
    }

    @AfterMethod

    public void afterMethod() {
        System.out.println("************ I am Post-condition *************");
    }

}