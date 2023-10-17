package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Program {
	public static void main(String[] args) {
		Deque<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		que.addFirst(5);
		que.addLast(60);
		
		que.removeFirst();
		que.removeLast();
		
		Integer ele = null;
		/*while( !que.isEmpty()) {
			ele = que.getFirst();
			System.out.println(ele);
			que.removeFirst();
		}*/
		
		while( !que.isEmpty()) {
			ele = que.getLast();
			System.out.println(ele);
			que.removeLast();
		}
	}
	public static void main2(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		
		Integer ele = null;
		while( !que.isEmpty()) {
			ele = que.peek();
			System.out.println(ele);
			que.poll();
		}
	}
	public static void main1(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		Integer ele = null;
		while( !que.isEmpty()) {
			ele = que.element();
			System.out.println(ele);
			que.remove();
		}
	}
}
