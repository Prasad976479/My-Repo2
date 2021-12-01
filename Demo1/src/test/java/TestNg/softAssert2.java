package TestNg;


	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class softAssert2 {
			
	@Test
	public void Assertions()
	{
	SoftAssert abcd= new SoftAssert();
	System.out.println("We are using softaseert methods");
	
	
	// Below are the assertions used for softassert
	
	abcd.assertTrue(false,"Used False statement");

	abcd.assertFalse(true, "Used False statement");
	
	abcd.assertEquals(true, false, "Statements used are not matched");

	abcd.assertNotEquals(true, false, "AssertNotEqual should pass");

	abcd.assertNull(null, "This is not NULL");

	abcd.assertNotNull("Hello World !!!", "Statement used null");

	
	}

	}

