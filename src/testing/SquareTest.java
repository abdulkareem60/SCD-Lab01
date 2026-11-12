package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JUnitTesting obj = new JUnitTesting();
		int output = obj.square(5);
		assertEquals(25, output);
	}
	// This is Square Test (updated in branch v2)
}
