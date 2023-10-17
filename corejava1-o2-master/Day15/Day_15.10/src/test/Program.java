package test;
@FunctionalInterface
interface Printable{
	void print( );
}
public class Program {	
	public static void main(String[] args) {
		Printable p =  ( ) -> System.out.println("Lambda Exprssion");
		p.print();
	}
}
