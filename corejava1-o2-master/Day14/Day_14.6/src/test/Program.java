package test;
interface A{
	default void f1( ) {
		System.out.println("A.f1");
	}
}
interface B{
	default void f1( ) {
		System.out.println("B.f1");
	}
}
class C implements A, B{
	@Override
	public void f1() {
		System.out.println("c.f1");
	}
}
public class Program {
	public static void main(String[] args) {
		C c = new C();
		c.f1();
	}
}
