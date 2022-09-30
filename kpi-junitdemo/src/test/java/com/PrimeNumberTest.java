package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void evaluatesExpression() {
		PrimeNumber prime = new PrimeNumber();
		String ans = prime.sol(0);
		assertEquals("Prime Number",ans);
	}
	
}
