package test;
public class Program {
	private String message = "Hello";
	public void print( ) throws InterruptedException {
		synchronized (message) {
			System.out.println(message); //Hello
			this.wait( 5000 ); //IllegalMonitorStateException
		}
	}
	public void printRecord( ) throws InterruptedException {
		synchronized (this) {
			System.out.println(message); //Hello
			this.wait( 5000 ); //OK
		}
	}
	public static void main(String[] args) {
		try {
				Program p = new Program();
				p.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
