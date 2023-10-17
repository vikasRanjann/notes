package test;

import java.lang.reflect.Field;

class Complex{
	private int real;
	private int imag;
	public Complex() {
		this.real = 10;
		this.imag = 20;
	}
	public int getReal() {
		return real;
	}
	public int getImag() {
		return imag;
	}
}
public class Program {
	public static void main(String[] args) throws Exception {
		Complex c1 = new Complex();
		System.out.println("Real Number	:	"+c1.getReal());
		System.out.println("Imag Number	:	"+c1.getImag());
		
 		Class<?> c = c1.getClass();
 		Field field = null;
 		
  		field = c.getDeclaredField("real");
  		field.setAccessible(true);
  		field.setInt(c1, 50);
  		
  		field = c.getDeclaredField("imag");
  		field.setAccessible(true);
  		field.setInt(c1, 60);
  		
  		System.out.println("Real Number	:	"+c1.getReal());
  		System.out.println("Imag Number	:	"+c1.getImag());
	}
}
