package test;
class SumArray{
	public int sum( int[] arr ) throws InterruptedException {
		int result = 0;
		for( int element : arr ) {
			result = result + element; 
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+result);
			Thread.sleep(350);
		}
		return result;
	}
}
class CThread implements Runnable{
	private int[] arr;
	Thread thread;
	public CThread(String name, int[] arr ) {
		this.arr = arr;
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	static SumArray sa = new SumArray();
	@Override
	public void run() {
		try {
			synchronized( sa )
			{
				int result = sa.sum(this.arr);
				System.out.println("Result	:	"+result);
			}
			
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
public class Program {
	public static void main(String[] args) throws Exception{
		int[ ]arr1 = { 1,2,3,4,5,6,7,8,9,10};
		CThread th1 = new CThread("th1", arr1);
		
		int[ ]arr2 = { 11,12,13,14,15,16,17,18,19,20};
		CThread th2 = new CThread("th2", arr2);
		
		int[ ]arr3 = { 21,22,23,24,25,26,27,28,29,30};
		CThread th3 = new CThread("th3", arr3);
		
		int[ ]arr4 = { 31,32,33,34,35,36,37,38,39,40};
		CThread th4 = new CThread("th4", arr4);
		
		while( true ) {
			System.out.println(th1.thread.getName()+"	"+th1.thread.getState().name());
			System.out.println(th2.thread.getName()+"	"+th2.thread.getState().name());
			System.out.println(th3.thread.getName()+"	"+th3.thread.getState().name());
			System.out.println(th4.thread.getName()+"	"+th4.thread.getState().name());
			Thread.sleep(100);
		}
	}
}
