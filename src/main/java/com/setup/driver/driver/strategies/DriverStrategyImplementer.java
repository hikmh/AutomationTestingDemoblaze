package com.setup.driver.driver.strategies;


import com.setup.driver.utils.Constants;

public class DriverStrategyImplementer {
	
	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		
		case Constants.Chrome :
			return new Chrome();
		
		case Constants.Firefox :
			return new Firefox();
			
		default : 
			return null;
		}
	}
}
