package TestNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestNgAssertions {
	
	
	public void Example1() 
	{
		//AssertEquals-
		Assert.assertEquals("Hello", "Hello", "Assertion is not expeced,Something went wrong !!");
	}

	public void Example2() 
	{
		
		//assertNotEquals-
		Assert.assertNotEquals("Hello", "World", "Assertion is not expeced,Something went wrong !!");
		
		}
	
	public void Example3() 
	{
		
		//assertTrue-
		Assert.assertTrue(true);
		
		}
	
	public void Example4() 
	{
		
		//assertTrue-
		//Assert.assertFalse(false);
		//Assert.assertFalse(true, "Used Assert is False !!!");
		Assert.assertFalse(false, "You are there");
		
		}
	public void Example5() 
	{
		
		//assertNull-
		Assert.assertNull(null, "This is NULL");
		
		}
	
	public void Example6() 
	{
		
		//assertNOTNull-
		
		Assert.assertNotNull("I am not null !!");
		}
	 
}
