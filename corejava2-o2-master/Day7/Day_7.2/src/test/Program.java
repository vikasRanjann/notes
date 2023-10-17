package test;

import java.lang.Thread.State;

public class Program {
	public static void main(String[] args) {
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
	public static void main1(String[] args) {
		Thread thread = Thread.currentThread();
		//Returns a string representation of current thread;
		//including the thread's name, priority, and thread group.
		System.out.println(thread.toString()); //Thread[main,5,main]
	}
}
