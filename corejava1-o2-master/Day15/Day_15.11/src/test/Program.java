package test;
@FunctionalInterface
interface Math{
	void sum( int num1, int num2 );
}
public class Program {	
	public static void main(String[] args) {
		//Math m = (int num1, int num2) -> System.out.println("Sum	:	"+(num1 + num2));
		//Math m = ( num1, num2) -> System.out.println("Sum	:	"+(num1 + num2));
		Math m = ( n1, n2) -> System.out.println("Sum	:	"+(n1 + n2));
		m.sum(10, 20);
	}
}
