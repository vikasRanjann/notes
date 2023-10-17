package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT_NUMBER = 5689;
	public static void main(String[] args) {
		try( Socket socket = new Socket("localhost", PORT_NUMBER);
			 DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			 DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			 Scanner sc = new Scanner(System.in);){
			String message = "";
			
			do
			{
				message = dis.readUTF();
				System.out.println("C:Server	:	"+message);
				
				System.out.print("C:Cilent	:	");
				message = sc.nextLine();
				dos.writeUTF(message);
				dos.flush();
			}while( !message.equalsIgnoreCase("end"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
