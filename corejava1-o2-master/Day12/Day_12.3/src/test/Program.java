package test;

public class Program {
	public static final String s3 = "SunBeam";
	public static void main(String[] args) {
		String s4 = "SunBeam";
		
		System.out.println(p1.Test.s1 == test.Test.s2);	  //true
		System.out.println(p1.Test.s1 == test.Program.s3);//true
		System.out.println(p1.Test.s1 == s4 );//true
		
		System.out.println(test.Test.s2 == test.Program.s3);//true
		System.out.println(test.Test.s2 == s4);//true
	
		System.out.println(test.Program.s3 == s4);//true
	}
	
}
