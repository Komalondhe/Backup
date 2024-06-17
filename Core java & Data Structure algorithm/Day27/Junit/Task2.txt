package com.Day27;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

class MathOperationsTest2 {

	    @BeforeClass
	    public static void setUpClass() {
	        System.out.println("BeforeClass: Executed once before any test method");
	    }

	    @AfterClass
	    public static void tearDownClass() {
	        System.out.println("AfterClass: Executed once after all test methods");
	    }

	    @Before
	    public void setUp() {
	        System.out.println("Before: Executed before each test method");
	    }

	    @After
	    public void tearDown() {
	        System.out.println("After: Executed after each test method");
	    }

	    @Test
	    public void testAdd() {
	        assertEquals(5, MathOperations.add(2, 3));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(3, MathOperations.subtract(5, 2));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(6, MathOperations.multiply(2, 3));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2, MathOperations.divide(6, 3));
	    }
	}



