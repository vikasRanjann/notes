package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	private static Map<Integer, String> getMap() {
		Map<Integer, String> map = new Hashtable<>( );
		map.put(23, "DAC");
		map.put(65, "DMC");
		map.put(40, "DESD");
		map.put(7, "DBDA");
		map.put(98, "PREDAC");
		return map;
	}
	private static void printKeys(Map<Integer, String> map) {
		if( map != null ) {
			Set<Integer> keys = map.keySet();
			for( Integer key : keys )
				System.out.println(key);
		}	
	}
	private static void printValues(Map<Integer, String> map) {
		if( map != null ) {
			Collection<String> values = map.values();
			for( String value : values ) {
				System.out.println(value);
			}
		}
	}
	private static void printEntries(Map<Integer, String> map) {
		if( map != null ) {
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey()+"	"+entry.getValue());
			}
		}
	}
	private static List<String> getList(Map<Integer, String> map) {
		if( map != null )
		{
			List<String> list = new ArrayList<>( map.values());
			return list;
		}
		return null;
	}
	private static String find(Map<Integer, String> map, int id) {
		if( map != null ) {
			Integer key = new Integer(id);
			if( map.containsKey(key))
				return map.get(key);
		}
		return null;
	}
	private static String remove(Map<Integer, String> map, int id) {
		if( map != null ) {
			Integer key = new Integer(id);
			if( map.containsKey(key))
				return map.remove(key);
		}
		return null;
	}
	public static void main(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		String value = Program.remove( map, 40 );
		Program.printEntries(map);	
	}
	public static void main5(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		String value = Program.find( map, 40 );
		System.out.println(value);
	}
	public static void main4(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		List<String> list = Program.getList( map );
		list.forEach(System.out::println);
	}
	public static void main3(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		Program.printEntries( map );
	}
	public static void main2(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		Program.printValues( map );
	}
	public static void main1(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		Program.printKeys( map );
	}
}
