package test;

interface Printable{
	void print( );
}
class Test implements Printable{
	@Override
	public void print() {
		System.out.println("Inside Print");
	}
}
public class Program {
	public static void main1(String[] args) {
		Printable  p = new Test();
		p.print();
	}
	public static void main(String[] args) {
		Printable p = new Printable() {
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		};
		p.print();
	}
}
