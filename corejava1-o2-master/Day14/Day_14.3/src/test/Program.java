package test;
interface A{
	int num1 = 10;
	int num4 = 40;
	int num5 = 70;
}
interface B{
	int num2 = 20;
	int num4 = 50;
	int num5 = 80;
}
interface C extends A, B{
	int num3 = 30;
	int num4 = 60;
}
public class Program {
	public static void main(String[] args) {
		System.out.println("Num5	:	"+A.num5);
		System.out.println("Num5	:	"+B.num5);
		System.out.println("Num5	:	"+C.num5); //Ambiguity Error
	}
	public static void main2(String[] args) {
		System.out.println("Num4	:	"+A.num4);
		System.out.println("Num4	:	"+B.num4);
		System.out.println("Num4	:	"+C.num4);
	}
	public static void main1(String[] args) {
		System.out.println("Num1	:	"+A.num1);
		System.out.println("Num2	:	"+B.num2);
		
		
		System.out.println("Num1	:	"+C.num1);
		System.out.println("Num2	:	"+C.num2);
		System.out.println("Num3	:	"+C.num3);
	}
}
