package org.sunbeam.online.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print("arr[ "+row+" ][ "+col+" ]	:	");
					arr[ row ][ col ] = sc.nextInt();
				}
			}
		}
	}
	private static void printRecord(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print(arr[ row ][ col ]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int[ 4 ][  ];
		arr[ 0 ] = new int[  ] { 1,2,3};
		arr[ 1 ] = new int[  ] { 1,2,3,4};
		arr[ 2 ] = new int[ ] { 1, 2};
		arr[ 3 ] = new int[ ] { 1,2,3,4,5};
		for( int[] i : arr ) {
			for( int j : i ) {
				System.out.print(j+"	");
			}
			System.out.println();
		}
	}
	public static void main5(String[] args) {
		int[][] arr = new int[ 4 ][  ];
		arr[ 0 ] = new int[  ] { 1,2,3};
		arr[ 1 ] = new int[  ] { 1,2,3,4};
		arr[ 2 ] = new int[ ] { 1, 2};
		arr[ 3 ] = new int[ ] { 1,2,3,4,5};
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(Arrays.toString( arr[ index ] ) );
	}
	public static void main4(String[] args) {
		int[][] arr = new int[ 4 ][  ];
		arr[ 0 ] = new int[  ] { 1,2,3};
		arr[ 1 ] = new int[  ] { 1,2,3,4};
		arr[ 2 ] = new int[ ] { 1, 2};
		arr[ 3 ] = new int[ ] { 1,2,3,4,5};
		Program.printRecord( arr );
	}
	public static void main3(String[] args) {
		int[][] arr = new int[ 4 ][  ];
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 4  ];
		arr[ 2 ] = new int[ 2 ];
		arr[ 3 ] = new int[5  ];
		Program.acceptRecord(arr);
		Program.printRecord( arr );
	}
	public static void main2(String[] args) {
		int[][] arr = null;
		arr = new int[ 4 ][  ];
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[4  ];
		arr[ 2 ] = new int[ 2 ];
		arr[ 3 ] = new int[5  ];
		
		
		Program.printRecord( arr );
	}
	public static void main1(String[] args) {	
		int arr1[][] = null;	//OK
		int[] arr2[] = null;	//OK
		int[][] arr3 = null;	//OK
	}
}
