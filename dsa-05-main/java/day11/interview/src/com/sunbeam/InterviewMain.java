package com.sunbeam;

import java.util.HashMap;
import java.util.Map.Entry;

public class InterviewMain {
	/*
	public static void countCharOccurances(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ch = Character.toUpperCase(ch);
			int count = map.getOrDefault(ch, 0);
			map.put(ch, count+1);
		}
		
		for (Entry<Character, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	*/
	
	public static void countCharOccurances(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ch = Character.toUpperCase(ch);
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				arr[index] = arr[index] + 1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0)
				System.out.println((char)('A' + i) + " : " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		countCharOccurances("Welcome to SunBeam");
	}

}
