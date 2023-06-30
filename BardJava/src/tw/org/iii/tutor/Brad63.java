package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class Brad63 {

	public static void main(String[] args) {
		String mesg="hello,world";
		byte[] data=mesg.getBytes();
		try {
			DatagramSocket socket=new DatagramSocket();
			DatagramPacket packet=new DatagramPacket(data,data.length,InetAddress.getByName("10.0.101.0"),8888);
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
