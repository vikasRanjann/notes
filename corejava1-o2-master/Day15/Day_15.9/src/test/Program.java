package test;
interface Printable{
	void print( );
}
public class Program {	//Program.class
	public static void main(String[] args) {
		Printable p = new Printable() {
			@Override
			public void print() {
				System.out.println("Inside anonymous inner class");
			}
		};
		p.print();
	}
}
