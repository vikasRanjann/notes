package test;

class Entry<K,V>
{
	private K key;
	private V value;
	public Entry() {
	}
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
public class Program {
	public static void main(String[] args) {
		Entry<Integer, String> e = new Entry<>( 1, "SunBeam");
		Integer key =  e.getKey();
		String value =  e.getValue();
		System.out.println(key+"	"+value);
	}
}
