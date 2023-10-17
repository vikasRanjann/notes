package test;

@FunctionalInterface
interface A{
	int sum( int a, int b); //Method Descriptor
}

public class Program {
	public static void main(String[] args) {
		A ref = ( a, b )-> a + b;
		int result = ref.sum(10, 20);
		System.out.println("Result	:	"+result);
		
	}
}
