package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class Test1 {
	@BeforeClass
	public static void init() {
		System.out.println("public void init()");	
	}
	@Before
	public void f1( ) {
		System.out.println("public void f1");
	}
	@Test
	public void test1() {
		System.out.println("Inside test1 method");
	}
	@Test @Ignore
	public void test2() {
		System.out.println("Inside test2 method");
	}
	@After
	public void f2( ) {
		System.out.println("public void f2");
	}
	@AfterClass
	public static void clean() {
		System.out.println("public static void clean");
	}
}
