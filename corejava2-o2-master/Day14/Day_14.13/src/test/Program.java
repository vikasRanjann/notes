package test;

@FunctionalInterface
interface A{
	int fact( int number ); //Method Descriptor
}
public class Program {
	public static int findFactorial( int number ){
		int result = 1;
		for( int count = 1; count <= number; ++ count )
			result = result * count;
		return result;		
	}
	public int factorial( int number ){
		int result = 1;
		for( int count = 1; count <= number; ++ count )
			result = result * count;
		return result;		
	}
	public static void main(String[] args) {
		Program p = new Program();
		A a = p::factorial;
		int result = a.fact(5);
		System.out.println("Factorial	:	"+result);
	}
	public static void main2(String[] args) {
		A a = Program::findFactorial;
		int result = a.fact(5);
		System.out.println("Factorial	:	"+result);
	}
	public static void main1(String[] args) {
		A a = number ->{
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		int result = a.fact(5);
		System.out.println("Factorial	:	"+result);
	}
}
