package test;


class Math{
	public static final double PI = 3.142;
	public static double pow( double base, int index ) {
		double result = 1;
		for( int count = 1; count <= index; ++ count )
			result = result *  base;
		return result;
	}
}
public class Program {
	public static void main(String[] args) {
		double radius = 10;
		double area;
		area = Math.PI * Math.pow(radius, 2);
		//System.out.println("Area	:	"+area);
		System.out.printf("Area	:	%5.2f\n",area);
	}
}
