package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad47 {

	public static void main(String[] args) {
		File source = new File("dir1/file1");

		try {
			FileInputStream fin = new FileInputStream(source);
			/*
			 * int c1=fin.read(); System.out.println((char)c1); int c2=fin.read();
			 * System.out.println((char)c2);
			 */
			//int len;
			byte[] buf = new byte[(int) source.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			/*
			 * while ((len = fin.read(buf)) != -1) { System.out.print(new String(buf, 0,
			 * len)); }
			 */

			;
			fin.close();
			System.out.println("finish");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
