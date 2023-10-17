package test;

class Test{
	public Test() {
		//System.out.println("Inside constructor");
	}
	public void print() {
		//System.out.println("Inside print");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		Thread thread = Thread.currentThread();
		String name =  thread.getName();
		System.out.println("Name	:	"+name);
		int priority = thread.getPriority();
		System.out.println("Priority	:	"+priority);
		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Group	:	"+group.getName());
		String state = thread.getState().name();
		System.out.println("State	:	"+state);
		boolean type = thread.isDaemon();
		System.out.println("Type	:	"+( type ? "Daemon Thread" : "User Thread" ));
		boolean status = thread.isAlive();
		System.out.println("Status	:	"+( status ? "Alive" : "Dead" ));
	}
}
public class Program {
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t = null;
		System.gc();
	}
}
