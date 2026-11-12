package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JUnitTesting obj = new JUnitTesting();
		int output = obj.countA("abdul kareem");
		assertEquals(2, output);
	}
}
