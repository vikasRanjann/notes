package server;

import java.net.Inet4Address;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import implementation.Calculator;

public class Program {
	public static final int PORT = 5764;
	public static void main(String[] args) throws Exception{
		System.out.println(Inet4Address.getLocalHost().getHostAddress());
	}
	public static void main1(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry(PORT);
			Remote remoteObject = new Calculator();
			registry.bind("Calci", remoteObject);
			System.out.println("Server is ready....");
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
