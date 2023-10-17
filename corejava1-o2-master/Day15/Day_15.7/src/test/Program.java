package test;
public class Program {	//Program.class
	public static void main(String[] args) {
		//Object obj; //Reference
		//new Object(); //Anonymous instance
		//Object obj = new Object(); //Instantiation
		Object obj = new Object()
		{
			private String message = "Inside anonymous inner class";
			@Override
			public String toString() {
				return this.message;
			}
		};
		
		String str = obj.toString();
		System.out.println(str);
	}
}
