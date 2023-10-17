package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Program {
	public static int PORT = 4563;
	public static void main(String[] args) {
		try( ServerSocket serverSocket = new ServerSocket(PORT);){
			System.out.println("Server is ready...");
			while( true ) {
				Socket socket =  serverSocket.accept();
				System.out.println("Client is connected.");
				Runnable target = new CommunicationHandler( socket );
			}
		}
		catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
