package test;

interface A
{
	int number = 10;
	//public static final int number = 10;
	void print( );
	//public abstract void print( );
}
class B implements A
{
	@Override
	public void print() {
		System.out.println("Inside print");
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		
		
		A a = null;
		a = new B( );	//Upcasting
		a.print();
	}
}
