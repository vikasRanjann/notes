package org.sunbeam.online.java.test;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Complex[] arr = new Complex[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Complex();
		
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ].printRecord();	//NullPointerException
	}
	public static void main1(String[] args) {
		//Complex arr[ 3 ]; //in C/C++ => Array of objects
		//Complex *arr = ( Complex*)calloc( 3, sizeof( Complex));//in C => Array of objects
		//Complex *arr = new Complex[ 3 ]; //in C++ => Array of objects
		//Complex **arr = new *Complex[ 3 ];	//Array of pointers
		
		
		Complex[] arr = new Complex[ 3 ]; //Array of references.
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ].printRecord();	//NullPointerException
	}
}
