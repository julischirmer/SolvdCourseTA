package com.solvd.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class MyTestClass extends AbstractTestClass {
    Logger logger = LogManager.getLogger(MyTestClass.class);

//    @BeforeSuite
//    public void beforeSuite() {
//        logger.info("Before suite");
//    }
//
//    @BeforeGroups
//    public void beforeGroups() {
//        logger.info("Before groups");
//    }

    @BeforeTest
    public void beforeTest() {
        logger.info("Before test");
    }

    @BeforeClass
    public void beforeClass() {
        logger.info("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.info("Before method");
    }


    @Test
    public void simpleTest1() {
        logger.info("This is test");
    }

    @Test
    public void simpleTest2() {
        logger.info("This is test2");
    }

    @AfterMethod
    public void afterMethod() {
        logger.info("After method");
    }

    @AfterClass
    public void afterClass() {
        logger.info("After class");
    }

    @AfterTest
    public void afterTest() {
        logger.info("After test");
    }

//    @AfterGroups
//    public void afterGroups() {
//        logger.info("After groups");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        logger.info("After suite");
//    }

}
