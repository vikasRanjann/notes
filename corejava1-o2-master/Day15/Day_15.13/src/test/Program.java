package test;
@FunctionalInterface
interface Math{
	int power( int number );
}
public class Program {	
	public static void main(String[] args) {
		//Math m = ( int number ) -> number * number;
		//Math m = ( number ) -> number * number;
		Math m = number -> number * number;
		int result = m.power(5);
		System.out.println("Result	:	"+result);
	}
}
