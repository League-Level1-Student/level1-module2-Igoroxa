package _04_unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void test() {
		assertEquals(5, getDistance(5, 10));
		assertEquals(15, getDistance(5, -10));
	}
	
	int getDistance(int x1, int x2) {
		return Math.abs(x1 - x2);
	}

}
