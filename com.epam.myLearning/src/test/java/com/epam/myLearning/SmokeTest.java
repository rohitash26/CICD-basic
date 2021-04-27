package com.epam.myLearning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {
	
	Logger logger = LogManager.getLogger(SmokeTest.class);
	
	@Test
	public void smoke() {
		logger.info("This is a smoke suite...!!");
		Assert.assertTrue(true);
	}
}
