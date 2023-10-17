package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CommunicationHandler implements Runnable {
	private Socket socket;
	private Thread thread;
	public CommunicationHandler(Socket socket) {
		this.socket = socket;
		this.thread = new Thread( this );
		this.thread.start();
	}
	@Override
	public void run()throws RuntimeException {
		try( DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
				DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				Scanner sc = new Scanner(System.in);){
				String message = "";
				do {
					System.out.print("S:Server	:	");
					message = sc.nextLine();
					outputStream.writeUTF(message);
					outputStream.flush();
					
					message = inputStream.readUTF();
					System.out.println("S:Client	:	" + message);
					
				} while (!message.equalsIgnoreCase("end"));
		}
		catch( Exception ex ) {
			throw new RuntimeException(ex);
		}
	}
}
