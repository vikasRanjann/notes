package test;
@FunctionalInterface
interface Math{
	int sum( int num1, int num2 );
}
public class Program {	
	public static void main(String[] args) {
		Math m = ( num1, num2) -> num1 + num2;
		int res = m.sum(10, 20);
		System.out.println("Result	:	"+res);
	}
}
