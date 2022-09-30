package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {
	@Test
	public void evaluatesExpression() {
		Palindrome palindrometest = new Palindrome();
		String ans = palindrometest.palindrome(1221);
		assertEquals("Palindrome",ans);
	}
}
