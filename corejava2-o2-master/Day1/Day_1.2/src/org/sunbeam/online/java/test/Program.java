package org.sunbeam.online.java.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Program {
	public static void main1(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>( );
		
		List<Integer> list2 = new ArrayList<>( );	//Upcasting
		
		Collection<Integer> list3 = new ArrayList<>( );	//Upcasting
	}
	public static void main2(String[] args) {
		int initialCapacity = 15;
		
		ArrayList<Integer> list1 = new ArrayList<>( initialCapacity );
		
		List<Integer> list2 = new ArrayList<>( initialCapacity );	//Upcasting
		
		Collection<Integer> list3 = new ArrayList<>( initialCapacity );	//Upcasting
	}
	public static void main3(String[] args) {
		//Collection<Integer> c = new ArrayList<>( );
		//Collection<Integer> c = new LinkedList<>();
		//Collection<Integer> c = new ArrayDeque<>();
		Collection<Integer> c = new TreeSet<>();
		c.add(10);
		c.add(20);
		
		ArrayList<Integer> list1 = new ArrayList<>( c );
		
		List<Integer> list2 = new ArrayList<>( c  );	//Upcasting
		
		Collection<Integer> list3 = new ArrayList<>( c );	//Upcasting
	}
}
