package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import welcome.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator mycal = new Calculator();
		int sum = mycal.add(2, 3);
		System.out.println("RunningAdd test");
		assertEquals(sum, 5);
	}
}
