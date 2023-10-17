package sunbeam;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.MathTest;

public class Program {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathTest.class);
		List<Failure> failures = result.getFailures( );
		for (Failure failure : failures)
			System.out.println(failure);
		System.out.println(result.wasSuccessful());
	}
}
