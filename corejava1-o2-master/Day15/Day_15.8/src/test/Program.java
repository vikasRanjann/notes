package test;
abstract class Shape{
	protected double area;
	public abstract void calculateArea();
	public double getArea() {
		return area;
	}
}
public class Program {	//Program.class
	public static void main(String[] args) {
		Shape sh = new Shape() { //Program$1.class
			private double radius = 10;
			@Override
			public void calculateArea() {
				this.area = Math.PI * Math.pow(this.radius, 2);
			}
		};
		sh.calculateArea();
		System.out.println("Area	:	"+sh.getArea());
	}
}
