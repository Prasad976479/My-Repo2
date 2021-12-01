package TestNg;

import org.testng.annotations.DataProvider;


	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	public class Dataprovider {
	
	
	    @DataProvider (name = "data-provider")
	     public Object[][] dpMethod(){
		 return new Object[][] {{"First-Value"}, {"Second-Value"}};
	     }
		
	    @Test (dataProvider = "data-provider")
	    public void abcdTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
	}

