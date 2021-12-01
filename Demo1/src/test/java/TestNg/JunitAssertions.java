package TestNg;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitAssertions {

	@Test
	public void Assertions() {
		String abc = new String("abc");
		String xyz = new String("abc");
		String empty = null;

		int value = 5;
		int value2 = 6;

		String array1[] = { "Junit", "testNg" };
		String array2[] = { "Junit", "testNg" };

		assertEquals(abc, xyz);

		assertTrue(value < value2);

		assertFalse(value > value2);

		assertNotNull(abc);

		assertNull(empty);

		assertSame(abc, abc);

		assertNotSame(abc, xyz);

		assertArrayEquals(array1, array2);
	}
}
