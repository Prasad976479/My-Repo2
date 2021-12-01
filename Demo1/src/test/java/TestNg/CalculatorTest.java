package TestNg;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
Calculator calc=new Calculator();
	@Test
	public void testAdd1() {
		assertEquals(calc.add1(5, 4),9);
	}

	@Test
	public void testSub1() {
		assertEquals(calc.sub1(5, 4),1);
		
		
	}
	
@Test
public void prasad() {
	System.out.println("Prasads");
}
}
