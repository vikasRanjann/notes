package test;
class CThread implements Runnable{
	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getState().name());
		System.out.println("Inside run");
	}
}
public class Program {
	public static void main(String[] args) {
		Runnable target = new CThread( );	//Upcasting
		Thread th = new Thread(target);
		//System.out.println(th.getState().name());//NEW
		th.start(); //RUNNABLE
		//th.start(); //IllegalThreadStateException
	}
}
