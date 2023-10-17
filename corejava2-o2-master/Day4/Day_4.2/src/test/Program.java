package test;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {
	private static Dictionary<Integer, String> getDictionary() {
		Dictionary<Integer, String> d = new Hashtable<>(); //Upcasting
		d.put(33, "Sandeep");
		d.put(4, "Prashasnt");
		d.put(45, "Digvijay");
		d.put(53, "Sonal");
		d.put(30, "Sonali");
		return d;
	}
	private static void printKeys(Dictionary<Integer, String> d) {
		Integer key = null;
		Enumeration<Integer> keys = d.keys();
		while( keys.hasMoreElements()) {
			key = keys.nextElement();
			System.out.println(key);
		}
	}
	private static void printValues(Dictionary<Integer, String> d) {
		String value = null;
		Enumeration<String> values = d.elements();
		while( values.hasMoreElements()) {
			value = values.nextElement();
			System.out.println(value);
		}
	}	
	public static void main(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary( );
		Integer key = new Integer(4);
		String value = d.remove(key);
		System.out.println(key +" "+value);
	}
	public static void main4(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary( );
		Integer key = new Integer(4);
		String value =  d.get(key);
		System.out.println(value);
	}
	public static void main3(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary( );
		Program.printValues( d );
	}

	public static void main2(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary( );
		Program.printKeys( d );
	}

	public static void main1(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary( );
		System.out.println("No. Of. Entries	:	"+d.size());
	}
}
