package test;

class CThread implements Runnable{
	private Thread thread;
	public CThread( String name ) {
		this.thread = new Thread( this );
		this.thread.setName(name);
		this.thread.start();
	}
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.setPriority(Thread.NORM_PRIORITY - 3 );
		System.out.println(thread.getName()+"	:	"+thread.getPriority());
	}
}
public class Program {
	public static void main(String[] args) throws Exception{
		Thread thread = Thread.currentThread();
		thread.setPriority( Thread.NORM_PRIORITY + 3 );
		System.out.println(thread.getName()+"	:	"+thread.getPriority());
		
		Runnable target = new CThread("User Thread");
		
	}
	public static void main2(String[] args) throws Exception{
		Thread thread = Thread.currentThread();
		//thread.setPriority(thread.getPriority() + 6 ); //IllegalArgumentException
		thread.setPriority(thread.getPriority() - 5 ); //IllegalArgumentException
		System.out.println(thread.getName()+"	:	"+thread.getPriority());
	}
	public static void main1(String[] args) throws Exception{
		Thread thread = Thread.currentThread();
		//thread.setPriority(Thread.NORM_PRIORITY + 3 );
		thread.setPriority(thread.getPriority() + 3 );
		System.out.println(thread.getName()+"	:	"+thread.getPriority());
	}
}
