

package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	
	
	
  @Test(priority=2)
  public void second() {
	  System.out.println("abcd");
  }
  
  @Test(priority=1)
  public void first() {
	  System.out.println("efgh");
  }
  @Test(priority=-1)
  public void third() {
	  System.out.println("jklm");
  }
  
  @Test
  public void forth() {
	  System.out.println("pqrs");
  }
  @Test(priority=1)
  public void fifth() {
	  System.out.println("xyz");
  }
 
	
}