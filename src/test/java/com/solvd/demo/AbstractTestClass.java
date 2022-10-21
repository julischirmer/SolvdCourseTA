package com.solvd.demo;


import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public abstract class AbstractTestClass {
    Logger logger = Logger.getLogger(AbstractTestClass.class.getName());
    @BeforeMethod
    public void beforeMethodParent() {
        logger.info("This is parent method before test method");
    }
}
