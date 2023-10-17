package test;

import java.lang.Thread.State;

public class Program {
	public static void main(String[] args) {
		State[] states = State.values();
		for (State state : states) {
			String name = state.name();
			int ordinal = state.ordinal();
			System.out.printf("%-15s%-5d\n",name, ordinal);
		}
	}
}
