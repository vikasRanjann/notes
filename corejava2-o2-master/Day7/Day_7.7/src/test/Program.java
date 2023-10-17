package test;
class CThread extends Thread{
	public CThread( String name ) {
		super(name);
		//this.setName(name);
		this.start();
	}
	@Override
	public void run() {
		//TODO : B.L
	}
}
public class Program {
	public static void main(String[] args) {
		Thread th = new CThread("A");	//Upcasting
	}
}
