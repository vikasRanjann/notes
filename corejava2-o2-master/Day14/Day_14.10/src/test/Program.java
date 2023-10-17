package test;

@FunctionalInterface
interface A{
	void sum( int a, int b); //Method Descriptor
}

public class Program {
	public static void main(String[] args) {
		//A ref = ( int a, int b ) -> System.out.println("Sum	:	"+( a + b ));
		//A ref = (  a,  b ) -> System.out.println("Sum	:	"+( a + b ));
		A ref = (  x,  y ) -> System.out.println("Sum	:	"+( x + y ));
		ref.sum(10, 20);
	}
}
