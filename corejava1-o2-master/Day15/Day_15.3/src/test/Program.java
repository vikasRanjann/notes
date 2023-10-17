package test;

class Outer{
	private int num1 = 10;
	class Inner{
		private int num1 = 20;
		public void print( ) {
			int num1 = 30;
			System.out.println("Num1	:	"+Outer.this.num1);	//10
			System.out.println("Num1	:	"+this.num1);	//20
			System.out.println("Num1	:	"+num1);	//30
		}
	}
}
public class Program {
	public static void main(String[] args) {	
		Outer.Inner in = new Outer().new Inner();
		in.print();
	}	
}
