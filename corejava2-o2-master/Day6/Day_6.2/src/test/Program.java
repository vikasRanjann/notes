package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Program {
	public static void main(String[] args) {
		Integer number = new Integer(0);
		Class<?> c = number.getClass();
		Program.printTypeInfo( c );
		Program.printFieldInfo( c );
		Program.printConstructorInfo( c );
		Program.printMethodInfo( c );
	}

	private static void printMethodInfo(Class<?> c) {
		if( c != null ) {
			Method[] methods = c.getMethods();
			for (Method method : methods) {
				System.out.println(method.toString());
			}
		}
	}
	private static void printConstructorInfo(Class<?> c) {
		if( c != null ) {
			Constructor<?>[] constructors = c.getConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor.toString());
			}
		}
	}
	private static void printFieldInfo(Class<?> c) {
		if( c != null ) {
			Field[] fields = c.getFields();
			for (Field field : fields) {
				//System.out.println(field.toString());
				String modifier = Modifier.toString(field.getModifiers());
				String type =  field.getType().getSimpleName();
				String name = field.getName();
				System.out.printf("%-20s%-10s%-15s\n", modifier, type, name );
			}
		}
	}
	private static void printTypeInfo(Class<?> c) {
		if( c != null) {
			System.out.println("pakckage name	:	"+c.getPackage().getName());
			System.out.println("Type name	:	"+c.getSimpleName());
		}
	}
}
