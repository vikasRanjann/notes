package test;

import java.util.ArrayList;

public class Program {
	private static ArrayList<Integer> getIntegerList() {
		ArrayList<Integer> intList = new ArrayList<>( );
		intList.add(10);
		intList.add(20);
		intList.add(30);
		return intList;
	}
	private static ArrayList<Double> getDoubleList() {
		ArrayList<Double> doubleList = new ArrayList<>( );
		doubleList.add( 10.1 );
		doubleList.add( 20.2 );
		doubleList.add( 30.3 );
		return doubleList;
	}
	private static ArrayList<String> getStringList() {
		ArrayList<String> stringList = new ArrayList<>( );
		stringList.add("Pune");
		stringList.add("Mumbai");
		stringList.add("Nasik");
		return stringList;
	}
	/*private static void printList(ArrayList<?> list) {
		for( Object element : list )
			System.out.println(element);
	}*/
	/*private static void printList(ArrayList< ? extends Number > list) {
		for( Number element : list )
			System.out.println(element);
	}*/
	private static void printList(ArrayList< ? super Integer > list) {
		for( Object element : list )
			System.out.println(element);
	}
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Integer>(); //Not Ok
		ArrayList<Number> list = new ArrayList<Number>(); //Ok
		ArrayList<Number> list = new ArrayList<>(); //Ok
	}
	public static void main2(String[] args) {
	
		ArrayList<Integer> intList = Program.getIntegerList( );
		Program.printList( intList );
		
		ArrayList<Double> doubleList = Program.getDoubleList( );
		//Program.printList( doubleList );
		
		ArrayList<String> stringList =Program.getStringList( );
		//Program.printList( stringList );
	}
	public static void main1(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>( );
		intList.add(10);
		intList.add(20);
		intList.add(30);
		for( Integer element : intList )
			System.out.println(element);
		
		
		ArrayList<Double> doubleList = new ArrayList<>( );
		doubleList.add( 10.1 );
		doubleList.add( 20.2 );
		doubleList.add( 30.3 );
		for( Double element : doubleList )
			System.out.println(element);
		
		ArrayList<String> stringList = new ArrayList<>( );
		stringList.add("Pune");
		stringList.add("Mumbai");
		stringList.add("Nasik");
		for( String element : stringList )
			System.out.println(element );
	}
}
