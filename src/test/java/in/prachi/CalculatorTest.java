package in.prachi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.prachi.beans.Calculator;

public class CalculatorTest {
	@Test
	public void addTest() {
		Calculator c= new Calculator();
		int actualResult = c.add(10, 20);
		assertEquals(30,actualResult);
		
		
	}
	@Test
	public void mulTest() {
		Calculator c= new Calculator();
		int result = c.mul(8, 10);
		assertEquals(80, result);
	}

}
