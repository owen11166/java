package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.classes.Students;

public class Brad53 {

	public static void main(String[] args) {
		Students s1 = new Students(45, 32, 56, "brad");
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		try (FileOutputStream fout = new FileOutputStream("dir1/student2.s1");
				ObjectOutputStream out = new ObjectOutputStream(fout);) {
			out.writeObject(s1);
			out.flush();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
