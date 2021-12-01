package TestNg;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsTestNG {


	 
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);// Does not throw any exception even value is false
		System.out.println("softAssert Method Was Executed");
		
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);//It will throw exception becoz value is false
		System.out.println("hardAssert Method Was Executed");
	}
}