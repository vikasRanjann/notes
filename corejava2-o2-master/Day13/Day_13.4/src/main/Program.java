package main;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.Test1;
import test.Test2;

public class Program {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Test1.class, Test2.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) 	
			System.out.println(failure);
		System.out.println(result.wasSuccessful());
	}
}
