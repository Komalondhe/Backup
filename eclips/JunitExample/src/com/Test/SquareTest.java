package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Testing.JUnitTesting;

class SquareTest {

	@Test
	void test() {
		JUnitTesting test=new JUnitTesting();
		int output=test.square(5);
		assertEquals(85, output);
		// assertNotEquals(26, output);
		
		
		
		
		
		
	}

}
