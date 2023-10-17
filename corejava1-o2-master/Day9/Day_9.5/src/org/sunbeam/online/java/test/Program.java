package org.sunbeam.online.java.test;
//syntax of printf in C : int printf( const char *format, ... );
//printf is variable argument argument function
// In java, variable argumemnt method is called variable arity method
public class Program {
	public static void sum( int... args) {
		int result = 0;
		for( int element : args ) 	
			result = result + element;
		System.out.println("Result	:	"+result);
	}
	public static void main(String[] args) {
		Program.sum( );
		Program.sum( 10 );
		Program.sum( 10, 20  );
		Program.sum( 10, 20, 30  );
		Program.sum( 10, 20, 30, 40, 50  );
		Program.sum( 10, 20, 30, 40, 50, 10, 20, 30, 40, 50 );
	}
}
