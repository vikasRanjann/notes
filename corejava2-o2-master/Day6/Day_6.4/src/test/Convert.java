package test;

public class Convert{
	public static Object changeType( String type, String value ) {
		switch( type ) {
		case "int":		
			return Integer.parseInt(value);
		case "float":
			return Float.parseFloat(value);
		case "double":
			return Double.parseDouble(value);
		}
		return null;
	}
}