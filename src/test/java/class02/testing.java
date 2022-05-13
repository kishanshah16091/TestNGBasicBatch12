package class02;

import org.testng.annotations.*;

public class testing {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("I am before suite");

    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("I am after suite");

    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am after test");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("I am before class method");

    }

    public void afterclass() {
        System.out.println("I am after class method");
    }

    @BeforeMethod
    public void before() {
        System.out.println("this is my before method");
    }

    @AfterMethod
    public void after() {
        System.out.println("this is my after method");
    }

    @Test
    public void Test() {
        System.out.println("drive me crazy , drive me mad");
    }

    @Test
    public void Test2() {
        System.out.println("drive me to sanity , drive me to hell");
    }
}