package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Testing.Example2;

class LengthCount {

	@Test

	void test() {

		Example2 test=new Example2();

		int output=test.countA("Janani");

	assertEquals(2, output);

	}
	/*
	@Test

	void test1() {

		Example2 test=new Example2();

		String nullString=null;

		String notNullString="Maria";

		assertNull(nullString);

		//assertNotNull(notNullString);

	}*/
 
 
	}


