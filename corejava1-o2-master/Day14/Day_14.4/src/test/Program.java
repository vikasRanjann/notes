package test;
interface A
{
	void f1();
}
interface B
{
	void f1();
}
abstract class C
{
	public abstract void f1();
}
class D extends C implements A, B
{
	@Override
	public void f1() {
		System.out.println("Inside f1");
	}	
}
public class Program {
	public static void main(String[] args) {
		
	}
}
