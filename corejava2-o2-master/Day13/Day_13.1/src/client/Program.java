package client;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import specification.Math;

public class Program {
	public static final int PORT = 5764;
	static Scanner sc = new Scanner( System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sum");
		System.out.println("2.Sub");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry( PORT );
			Math remoteObject = (Math) registry.lookup("Calci");
			
			// rmi://[host][:port][/[object]]
			//Math remoteObject = (Math) registry.lookup("rmi://localhost:5764/Calci");
			int choice;
			while(( choice = Program.menuList( ) ) != 0 ) {
				int result = 0;
				switch( choice ) {
				case 1:
					result = remoteObject.sum(100, 20);
					break;
				case 2:
					result = remoteObject.sub(100, 20);
					break;
				}
				System.out.println("Result	:	"+result);
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
