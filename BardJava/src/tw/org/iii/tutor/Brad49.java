package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad49 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir2/png1.png");
			FileInputStream fin = new FileInputStream("dir1/png1.png");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
