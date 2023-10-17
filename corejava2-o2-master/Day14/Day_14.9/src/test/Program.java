package test;

@FunctionalInterface
interface A{
	//Functional Method
	void f1( ); //Method Descriptor
}
class B implements A{
	@Override
	public void f1() {
		System.out.println("B.f1");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = () -> System.out.println("Lambda Expression");
		a.f1();
	}
	public static void main2(String[] args) {
		A a = new A() {
			@Override
			public void f1() {
				System.out.println("Anonymous inner class");
			}
		};
		a.f1();
	}
	public static void main1(String[] args) {
		A a = new B();
		a.f1();
	}
}
