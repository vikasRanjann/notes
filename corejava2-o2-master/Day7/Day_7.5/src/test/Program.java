package test;
class CThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside run");
	}
}
public class Program {
	public static void main1(String[] args) {
		//Runnable target = new CThread();
		//Thread th = new Thread( target );
		
		Thread th = new Thread( new CThread() );
		th.start();
	}
	public static void main2(String[] args) {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside run");
			}
		});
		th.start();
	}
	public static void main3(String[] args) {
		Thread th = new Thread( ()-> System.out.println("Inside run"));
		th.start();
	}
	public static void run( ) {
		System.out.println("Inside run");
	}
	public static void main(String[] args) {
		Thread th = new Thread( Program::run);
		th.start();
	}
}
