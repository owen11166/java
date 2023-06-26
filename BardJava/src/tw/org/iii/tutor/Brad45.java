package tw.org.iii.tutor;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Brad45 {

	public static void main(String[] args) {
		File dir1 = new File("dir1");
		File[] files = dir1.listFiles();
		System.out.println(files.length);
		for (File i : files) {
			Date mTime = new Date(i.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			System.out.printf("%s:%d%s%s%n", i.getName(), i.length(), i.isDirectory(), sdf.format(mTime));
		}
	}

}
