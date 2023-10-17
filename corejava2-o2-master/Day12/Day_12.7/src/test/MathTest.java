package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import sunbeam.Math;

public class MathTest {
	
	Math m;
	@BeforeClass
	public void init() {
		m = new Math();
	}
	@Test
	public void testSum() {
		int result  = m.sum(10, 20);
		assertEquals( 30, result );
	}
	@Test
	public void testSub() {
		int result  = m.sub(10, 30);
		assertEquals( -20, result );
	}

	@Test
	public void testMultiplication() {
		int result  = m.multiplication(10, 30);
		assertEquals( 300, result );
	}

	@Test
	public void testDivision() {
		int result  = m.division(10, 30);
		assertEquals( 0, result );
	}
	@Test
	public void testAssertions( ) {
		String s1 = new String("SunBeam");
		String s2 = new String("SunBeam");
		String s3 = null;
		String s4 = "SunBeam", s5 = "SunBeam";
		int num1 = 5, num2 = 6;
		//assertEquals(s1, s2);
		//assertTrue(num1 < num2 );
		//assertFalse(num1 > num2);
		//assertNotNull(s1);
		//assertNull(s3);
		//assertNotSame(s1, s2);
		assertSame(s4, s5);
	}
}
