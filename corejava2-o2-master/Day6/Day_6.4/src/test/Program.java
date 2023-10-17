package test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter F.Q. Class Name	:	");
			String className = sc.nextLine();	//math.Calculator
			
			Class<?> c = Class.forName(className);
			
			System.out.print("Enter method Name	:	");
			String methodName = sc.nextLine();	//sum
			
 			Method[] methods = c.getMethods();
 			for (Method method : methods) {
 				if( method.getName().equalsIgnoreCase(methodName)) {
 					Object[] arr = new Object[ method.getParameterCount() ];
  					 Parameter[] parameters = method.getParameters();
 					for( int index = 0; index < method.getParameterCount(); ++ index ){
 						String type = parameters[ index ].getType().getSimpleName();
 						System.out.print("Enter argument for "+type+" type : ");
 						String value = sc.nextLine();
 						arr[ index ] = Convert.changeType(type, value);
 					}
 					Object obj = c.newInstance();
					Object result = method.invoke(obj, arr);
 					System.out.println("Result	:	"+result);
 					break;
 				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
