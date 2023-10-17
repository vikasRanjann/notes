package com.sunbeam;

public class GreedyMain {
	public static int minCoinsInChange(int amount, int[] coins) {
		int i = 0, count = 0;
		while(i < coins.length) {
			int coin = coins[i];
			if(coin <= amount) {
				count++;
				amount = amount - coin;
				continue;
			}
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] coins = {100, 50, 20, 10, 5, 2, 1};
		int amount = 36;
		int count = minCoinsInChange(amount, coins);
		System.out.println("Coin Count: " + count);
	}
}
