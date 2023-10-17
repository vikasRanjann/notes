package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static int PORT = 4563;

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", PORT);
				DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
				DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				Scanner sc = new Scanner(System.in);) {
			String message = "";
			do {
				message = inputStream.readUTF();
				System.out.println("C:Server	:	" + message);

				System.out.print("C:Client	:	");
				message = sc.nextLine();
				outputStream.writeUTF(message);
				outputStream.flush();
			} while (!message.equalsIgnoreCase("end"));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
