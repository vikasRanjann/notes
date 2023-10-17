package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Calculator;

public class Test1 {

	static Calculator c;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c = new Calculator();
	}

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testSum() {
		//Calculator c = new Calculator();
		int result = c.sum(10, 20);
		assertEquals(30, result);
	}
	@Test
	public void testSub() {
		//Calculator c = new Calculator();
		int result = c.sub(100, 20);
		assertEquals(80, result);
	}
	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		c = null;
	}
}
