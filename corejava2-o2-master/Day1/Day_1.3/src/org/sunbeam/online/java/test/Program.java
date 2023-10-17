package org.sunbeam.online.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		
		//Collections.sort(list);
		list.sort(null);
		list.forEach(System.out::println);
	}
	public static void main14(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Object[] arr = list.toArray();
		//System.out.println(Arrays.toString( arr ) );
		
		Integer[] arr = new Integer[ list.size() ];
		arr =  list.toArray(arr);
		System.out.println(Arrays.toString( arr ) );
	}
	public static void main13(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		//System.out.println(list.getClass().getSimpleName()); //ArrayList
		list.forEach(System.out::println);
	}
	public static void main12(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = null;
		//ListIterator<Integer> itr = list.listIterator();
		ListIterator<Integer> itr = list.listIterator( list.size() );
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print(element+"	");
		}
		System.out.println();
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main11(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer key = new Integer(30);
		if( list.contains(key))
		{
			 //int index = list.indexOf(key);
			 //list.remove(index);
			
			list.remove(key);
			 list.forEach(System.out::println);
		}
		else
			System.out.println(key+" not found");
	}
	public static void main10(String[] args) {
		Collection<Integer> keys = new ArrayList<>( );
		keys.add(20);
		keys.add(40);
		keys.add(60);
		
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		if( list.containsAll(keys))
		{
			//list.removeAll(keys);
			list.retainAll(keys);
			 list.forEach(System.out::println);
		}
		else
			System.out.println("keys not found");
	}
	public static void main9(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer key = new Integer(300);
		if( list.contains(key))
		{
			 int index = list.indexOf(key);
			 System.out.println("Index : "+index);
		}
		else
			System.out.println(key+" not found");
	}
	public static void main8(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>( );
		c.add(15);
		c.add(20);
		c.add(30);
		c.add(35);
		
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(40);
		list.add(50);
		//list.addAll(c);
		list.addAll(1, c);
		
		list.forEach(System.out::println);
		
	}
	public static void main7(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		for (Integer element : list) {
//			System.out.println(element);
//		}
		
		//list.forEach(element -> System.out.println(element) );
		list.forEach ( System.out::println );
	}
	public static void main6(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(400);
		list.add(50);
		list.add(2, 30);
		list.set(3, 40);
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ) {
			element = list.get(index);
			System.out.println(element);
		}
	}
	public static void main5(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(400);
		list.add(50);
		list.add(2, 30);
		list.set(3, 40);
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ) {
			element = list.get(index);
			System.out.println(element);
		}
	}
	public static void main4(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		Integer element = list.get(list.size()); //IndexOutOfBoundsException
	} 
	public static void main3(String[] args) {
		String str = "sunBeam"; //StringIndexOutOfBoundsException
		char ch = str.charAt( str.length());
	}
	public static void main2(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		Integer e1 = arr[ arr.length ]; //ArrayIndexOutOfBoundsException
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(400);
		list.add(50);
		list.add(2, 30);
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get( list.size() - 1 ) );
	}	
}
