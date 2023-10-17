package test;

public class Program {
	public static void main(String[] args) {
		Object obj = new Object() {
			@Override
			public String toString() {
				return "Inside anonymous inner class";
			}
		};
		System.out.println(obj.toString());
	}
}
