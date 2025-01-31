package testng;


import org.testng.annotations.*;

import java.beans.BeanProperty;

public class TestNGAnnotationTest {
    @BeforeSuite
    public void beforeMethod() {
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void  beforetest() {
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void beforeclass() {
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void beforeMeth() {
        System.out.println("BeforeMethod");
    }
    @Test(priority = 1)
    public void test2() {
        System.out.println("Test2");
    }
    @Test(priority = 2)
    public void test1() {
        System.out.println("Test1");
    }
    @AfterMethod
    public void  AfterMethod() {
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void  AfterClass () {
        System.out.println("AfterClass");
    }
    @AfterTest
    public void  AfterTest () {
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void  afterSuite() {
        System.out.println("AfterSuite");
    }


}
