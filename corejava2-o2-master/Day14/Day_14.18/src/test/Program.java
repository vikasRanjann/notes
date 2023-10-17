package test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class Program {
	public static final String pathname = "../Day_14.18/src/test/Program.java";
	public static void main(String[] args) {
		try(RandomAccessFile file = new RandomAccessFile(pathname, "r");) {
			Selector selector = Selector.open();
			FileChannel channel = file.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(50);
			int bsRead = 0;
			while( ( bsRead =  channel.read(buffer) ) != -1 ) {
				buffer.flip();
				while( buffer.hasRemaining()) {
					System.out.print((char)buffer.get());
				}
				buffer.clear();
			}
		} catch( Exception e) {
			e.printStackTrace();
		}
	}
}
