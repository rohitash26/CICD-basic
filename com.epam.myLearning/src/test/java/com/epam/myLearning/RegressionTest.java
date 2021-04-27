package com.epam.myLearning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {
	
	Logger logger = LogManager.getLogger(RegressionTest.class);
	
	@Test
	public void regression() {
		logger.info("This is a Regression Test!!");
		Assert.assertFalse(false);
	}
}
