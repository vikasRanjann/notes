package test;

abstract class Shape{
	protected double area;
	public abstract void calculateArea( );
	public double getArea() {
		return area;
	}
}
public class Program {
	public static void main(String[] args) {
		Shape sh = new Shape() {
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
