package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(20);
		list.addLast(30);
		list.addFirst(10);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main1(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(20);
		list.addLast(30);
		list.addFirst(10);
		
		for( Integer element : list )
			System.out.println(element);
	}
}
