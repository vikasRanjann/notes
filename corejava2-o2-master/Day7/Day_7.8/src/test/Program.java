package test;
class CThread extends Thread{
	public CThread( String name) {
		super(name);
		this.start();
	}
	@Override
	public void run() {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println(this.getName()+"	"+this.getState().name()+"	"+count);
				if( count == 5 )
					return;
				Thread.sleep(500); //TIMED_WAITING
			}
		} catch (InterruptedException ex) {
			throw new RuntimeException(ex);	//Exception Chaining
		}
	}
}
public class Program {
	public static void main(String[] args) throws Exception{
		Thread mainThread = Thread.currentThread();
		Thread th  = new CThread("User Thread");
		while( true) {
			System.out.println(th.getName()+"	"+th.getState().name());
			Thread.sleep(100);
		}
	}
}
