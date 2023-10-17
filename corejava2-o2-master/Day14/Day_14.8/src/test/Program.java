package test;

@FunctionalInterface
interface A{
	//Functional Method
	void f1( ); //Method Descriptor
	default void f2( )
	{	}
	default void f3( )
	{	}
	static void f4( )
	{	}
}
public class Program {
	public static void main(String[] args) {
	}
}
