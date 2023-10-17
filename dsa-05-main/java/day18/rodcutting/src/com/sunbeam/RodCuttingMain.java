package com.sunbeam;

public class RodCuttingMain {
	private static final int[] price = {0, 1, 5, 8, 9, 10, 14, 17, 20, 24, 30};
	private static int count;
	
	public static int recRodMaxPrice(int len) {
		count++;
		if(len == 0)
			return 0;
		int maxPrice = 0;
		for(int i=1; i<=len; i++)
			maxPrice = Math.max(maxPrice, price[i] + recRodMaxPrice(len - i));
		return maxPrice;
	}
	
	public static int memRodMaxPrice(int len, int[] maxPrices) {
		count++;
		if(maxPrices[len] != 0)
			return maxPrices[len];
		if(len == 0)
			return 0;
		int maxPrice = 0;
		for(int i=1; i<=len; i++)
			maxPrice = Math.max(maxPrice, price[i] + memRodMaxPrice(len - i, maxPrices));
		maxPrices[len] = maxPrice;
		return maxPrices[len];
	}
	public static int memRodMaxPrice(int len) {
		int[] maxPrices = new int[len + 1];
		return memRodMaxPrice(len, maxPrices);
	}
	
	public static int dpRodMaxPrice(int length) {
		count++;
		int[] maxPrices = new int[length + 1];
		maxPrices[0] = 0; // recursion base condition --> dp initial state
		for (int len = 1; len <= length; len++) {
			maxPrices[len] = 0;
			for(int i=1; i<=len; i++)
				maxPrices[len] = Math.max(maxPrices[len], price[i] + maxPrices[len - i]);
		}
		return maxPrices[length];
	}
	
	public static void main(String[] args) {
		int maxPrice, rodLength = 8;
		
		count = 0;
		maxPrice = recRodMaxPrice(rodLength);
		System.out.println("Max Price of Rod of Length " + rodLength + " is " + maxPrice + " (fn calls = " + count + ")");
	
		count = 0;
		maxPrice = memRodMaxPrice(rodLength);
		System.out.println("Max Price of Rod of Length " + rodLength + " is " + maxPrice + " (fn calls = " + count + ")");
	
		count = 0;
		maxPrice = dpRodMaxPrice(rodLength);
		System.out.println("Max Price of Rod of Length " + rodLength + " is " + maxPrice + " (fn calls = " + count + ")");
	}

}
