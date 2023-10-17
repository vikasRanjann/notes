package org.sunbeam.online.java.test;

import java.util.Arrays;

public class Program {
	private static void printRecord(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; ++ index )
				System.out.print(arr[ index ] +"	");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		for( int element : arr )
			System.out.println(element);
	}
	public static void main7(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		//System.out.println(arr.toString());// [I@7852e922
		System.out.println(Arrays.toString( arr ) );
	}
	public static void main6(String[] args) {
		int[] arr = new int[ ] { 50, 20, 30, 10, 40  };
		Program.printRecord(arr);
		Arrays.sort(arr);	//Dual-Pivot Quicksort
		Program.printRecord(arr);
	}
	public static void main5(String[] args) { 
		//int[] arr = new int[ -1 ]; //NegativeArraySizeException
		int element;
		int[] arr = new int[ ] { 10, 20, 30 };
		element = arr[ 0 ];
		System.out.println(element);//10
		
		element = arr[ 2 ];
		System.out.println(element);//30
		
		//element = arr[ -1 ];			//ArrayIndexOutOfBoundsException
		//element = arr[ arr.length ];	//ArrayIndexOutOfBoundsException
		System.out.println(element);
		
	}
	public static void main4(String[] args) { 
		//int[] arr = new int[  ]{ 10, 20, 30 };	//Or
		int[] arr = { 10, 20, 30 };
		Program.printRecord(arr);
	}
	public static void main3(String[] args) {
		int[] arr1 = new int[ 3 ];	//OK
		Program.printRecord( arr1 );
		
		int[] arr2 = new int[ 5 ];	//OK
		Program.printRecord( arr2 );
		
		int[] arr3 = new int[ 7 ];	//OK
		Program.printRecord( arr3 );
		
		int[] arr4 = null;	//OK
		Program.printRecord( arr4 );
		
	}
	public static void main2(String[] args) {
		int[] arr = null;
		arr = new int[ 3 ];	//OK
	}
	public static void main1(String[] args) {	
		//int arr[ 3 ];	//C/C++
		int arr1[ ] = null;	//reference	//OK
		int[ ] arr2 = null;	//reference	//OK
		//int[  arr3 ] = null;	//reference	//Not OK
		//int arr4[ 3 ] = null;	//reference	//Not OK
	}
}
