package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Calculator;

public class Test2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testDivision() {
		Calculator c = new Calculator();
		int result = c.division(10, 2);
		assertEquals( 5, result );
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testException() {
		Calculator c = new Calculator();
		int result = c.division(10, 0);
		assertEquals( 5, result );
	}
	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
