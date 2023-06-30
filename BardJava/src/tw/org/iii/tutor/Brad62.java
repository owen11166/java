package tw.org.iii.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad62 {

	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getByName("www.google.com");
			InetAddress ip2=InetAddress.getByName("192.168.3.4");
			System.out.println(ip2);
			System.out.println(ip);
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
