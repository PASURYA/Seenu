package org.mpn;

import org.testng.annotations.DataProvider;

public class Sample {
	
	@DataProvider(name="data")
	
	public static Object[][] getData() {
		return new Object
				[][] {{"surya","sam"},{"341981","520101"}};
		
	}

}
