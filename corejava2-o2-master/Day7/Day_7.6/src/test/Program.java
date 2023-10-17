package test;
class CThread implements Runnable{
	private Thread thread;
	public CThread( String name ) {
		this.thread  = new Thread( this, name );
		this.thread.start();
	}
	@Override
	public void run() {
		System.out.println("Inside run");
	}
}
public class Program {
	public static void main(String[] args) {
		Runnable target = new CThread("A");
	}
}
