package test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;
public class Program {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator( v.size() );
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main4(String[] args) {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator( 2 );
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
	public static void main3(String[] args) {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator();
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
	public static void main2(String[] args) {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		
		Integer element = null;
		Iterator<Integer> itr = v.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
			if( element == 20 )
				itr.remove();	//20
		}
		
		for( Integer e : v )
			System.out.println(e);
	}
	public static void main1(String[] args) {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		
		Integer element = null;
		Enumeration<Integer> e = v.elements();
		while( e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
		}
	}
}
