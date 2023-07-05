package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad50 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir2/png4.png");
			FileInputStream fin = new FileInputStream("dir1/png1.png");
			int len;
			byte[] buf = new byte[4 * 1024];
			while ((len = fin.read()) != -1) {
				fout.write(buf, 0, len);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println(System.currentTimeMillis() - start);
		} catch (Exception e) {

		}

	}

}
