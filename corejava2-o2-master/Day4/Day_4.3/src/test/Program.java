package test;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

class Pair<K,V> implements Entry<K, V>{

	private K key;
	private V value;
	public Pair() {
	}
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public V setValue(V value) {
		this.value = value;
		return this.value;
	}
}
public class Program {
	public static void main(String[] args) {
		Set<Entry<Integer,String>> set = new HashSet<<Entry<Integer,String>>();
		set.add(new Pair<>());
		set.add(new Pair<>());
		set.add(new Pair<>());
		set.add(new Pair<>());
	
	}
}
