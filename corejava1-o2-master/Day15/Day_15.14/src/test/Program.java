package test;
@FunctionalInterface
interface Math{
	int factorial( int number );
}
public class Program {	
	public static int fact1( int number ) {
		int fact = 1;
		for( int count = 1; count <= number; ++ count ) 
			fact = fact * count;
		return fact;
	}
	public int fact2( int number ) {
		int fact = 1;
		for( int count = 1; count <= number; ++ count ) 
			fact = fact * count;
		return fact;
	}
	public static void main(String[] args) {
		Program p = new Program();
		Math m = p::fact2;
		int result = m.factorial(5);
		System.out.println("Result	:	"+result);
	}
	public static void main2(String[] args) {
		//Math m = number -> Program.fact(number);
		Math m = Program::fact1;
		int result = m.factorial(5);
		System.out.println("Result	:	"+result);
	}
	
	public static void main1(String[] args) {
		Math m = number ->{
			int fact = 1;
			for( int count = 1; count <= number; ++ count ) 
				fact = fact * count;
			return fact;
		};
		int result = m.factorial(5);
		System.out.println("Result	:	"+result);
	}
}
