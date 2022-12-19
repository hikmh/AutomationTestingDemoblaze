package com.setup.driver.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import com.setup.driver.driver.strategies.DriverStrategy;
import com.setup.driver.driver.strategies.DriverStrategyImplementer;
import com.setup.driver.utils.Constants;


public class DriverSingleton {
	
	private static DriverSingleton instance=null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiante(driver);
	}

	public WebDriver instantiante(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constants.Timeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) {
		if (instance==null) {
			instance = new DriverSingleton(driver);
		}
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeObjectInstance() {
		instance = null;
		try{
		driver.quit();
		  } catch(NullPointerException e){
	            System.out.println("NullPointerException thrown!");
	        }
	}

}
