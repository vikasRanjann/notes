package test;

@FunctionalInterface
interface A{
	int square( int a); //Method Descriptor
}
public class Program {
	public static void main(String[] args) {
		//A ref = ( int a )-> a * a;
		//A ref = (  a )-> a * a;
		A ref =   a -> a * a;
		int result = ref.square(5);
		System.out.println("Result	:	"+result);
	}
}
