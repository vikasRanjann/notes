package test;

public class Program {
	public static void main(String[] args) {
		Integer n1 = new Integer(125);
		//int n2 = n1.intValue();	//UnBoxing
		int n2 = n1;	//Auto-UnBoxing
		System.out.println(n2);
	}
	public static void main3(String[] args) {
		//Object o1 = new Object(); //OK
		//Object o2 = new Integer(0); //Upcasting
		
		int number = 125;
		Object o = number;	//AutoBoxing
		//Object o =  Integer.valueOf(number);
		
	}
	public static void main2(String[] args) {
		String str = "125";
		int num1 = Integer.parseInt(str);	//UnBoxing
	}
	public static void main1(String[] args) {
		int num1 = 10;
		String str =  String.valueOf(num1);	//Boxing
	}
}
