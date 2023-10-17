package test;

class TickTock {
	public void tick(  ) throws InterruptedException {
		synchronized (this) {	
			System.out.print("Tick	");
			this.notify();
			this.wait( 5000 );
		}
	}

	public void tock( ) throws InterruptedException {
		synchronized (this) {
			System.out.println("	Tock");
			this.notify();
			this.wait( 5000 );
		}
	}
}

class CThread implements Runnable {
	private Thread thread;

	public CThread(String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}

	static TickTock tt = new TickTock();

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("TickThread")) {
				for (int count = 1; count <= 10; ++count) {
					tt.tick(  );
					Thread.sleep(250);
				}
				tt.tick(  );

			} else {
				for (int count = 1; count <= 10; ++count) {
					tt.tock(  );
					Thread.sleep(250);
				}
				tt.tock(  );
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}

public class Program {
	public static void main(String[] args) throws Exception {
		CThread th1 = new CThread("TickThread");
		CThread th2 = new CThread("TockThread");
	}
}
