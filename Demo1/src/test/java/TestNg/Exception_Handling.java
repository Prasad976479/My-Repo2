package TestNg;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exception_Handling {

	

	@Test (expected=Exception.class)
	public void test() {
		int a=10;
		int b=0;
		int c;
		c=a/b;
		System.out.println(c);
	}

}
