package com.sunbeam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
class Student {
	private String name;
	private double marks;
	public Student() {
	}
	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}

class HashTable {
	static class KeyValue {
		private int key; // roll
		private Student value; // Student object
		public KeyValue(int key, Student value) {
			this.key = key;
			this.value = value;
		}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public Student getValue() {
			return value;
		}
		public void setValue(Student value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "KeyValue [key=" + key + ", value=" + value + "]";
		}
	}

	private static final int SIZE = 100;
	private List<KeyValue> table[]; // arr
	public HashTable() {
		table = new List[SIZE];
		for (int i = 0; i < table.length; i++)
			table[i] = new LinkedList<KeyValue>();
	}
	
	public void put(int k, Student v) {
		int index = k % SIZE;
		for(KeyValue kv:table[index]) {
			if(kv.key == k) { // key is already present (duplicate)
				kv.value = v;
				return;
			}
		}
		// key was not already present (new key)
		KeyValue newKV = new KeyValue(k, v);
		table[index].add(newKV);
	}
	
	public Student get(int k) {
		int index = k % SIZE;
		for(KeyValue kv:table[index]) {
			if(kv.key == k) // key is found
				return kv.value;
		}
		return null; // not found
	}
}


public class HashTableMain {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(1002, new Student("A", 89));
		ht.put(2050, new Student("B", 99));
		ht.put(3012, new Student("C", 76));
		ht.put(3150, new Student("D", 77));
		ht.put(4000, new Student("E", 40));
		ht.put(5199, new Student("F", 73));
		ht.put(4298, new Student("G", 87));
		ht.put(3650, new Student("H", 82));
		ht.put(2198, new Student("I", 65));
		
		ht.put(3150, new Student("X", 89)); // duplicate
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll(key) to find: ");
		int key = sc.nextInt();
		Student value = ht.get(key);
		if(value == null)
			System.out.println("Student Not Found!");
		else
			System.out.println("Found: " + value);
	}
}
*/

class Student {
	private String name;
	private double marks;
	public Student() {
	}
	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}

class HashTable {
	static class KeyValue {
		private Integer key; // roll
		private Student value; // Student object
		public KeyValue(Integer key, Student value) {
			this.key = key;
			this.value = value;
		}
		public Integer getKey() {
			return key;
		}
		public void setKey(Integer key) {
			this.key = key;
		}
		public Student getValue() {
			return value;
		}
		public void setValue(Student value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "KeyValue [key=" + key + ", value=" + value + "]";
		}
	}

	private static final int SIZE = 100;
	private List<KeyValue> table[]; // arr
	public HashTable() {
		table = new List[SIZE];
		for (int i = 0; i < table.length; i++)
			table[i] = new LinkedList<KeyValue>();
	}
	
	public void put(Integer k, Student v) {
		int index = k.hashCode() % SIZE;
		for(KeyValue kv:table[index]) {
			if(kv.key.equals(k)) { // key is already present (duplicate)
				kv.value = v;
				return;
			}
		}
		// key was not already present (new key)
		KeyValue newKV = new KeyValue(k, v);
		table[index].add(newKV);
	}
	
	public Student get(Integer k) {
		int index = k.hashCode() % SIZE;
		for(KeyValue kv:table[index]) {
			if(kv.key.equals(k)) // key is found
				return kv.value;
		}
		return null; // not found
	}
}


public class HashTableMain {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(1002, new Student("A", 89));
		ht.put(2050, new Student("B", 99));
		ht.put(3012, new Student("C", 76));
		ht.put(3150, new Student("D", 77));
		ht.put(4000, new Student("E", 40));
		ht.put(5199, new Student("F", 73));
		ht.put(4298, new Student("G", 87));
		ht.put(3650, new Student("H", 82));
		ht.put(2198, new Student("I", 65));
		
		ht.put(3150, new Student("X", 89)); // duplicate
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll(key) to find: ");
		int key = sc.nextInt();
		Student value = ht.get(key);
		if(value == null)
			System.out.println("Student Not Found!");
		else
			System.out.println("Found: " + value);
	}
}
