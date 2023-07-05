package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.classes.Students;
//07051616
public class Brad54 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/student2.s1"));
			Object obj = oin.readObject();
			if (obj instanceof Students) {
				System.out.println("ok");
			}
			Students s1 = (Students) obj;
			System.out.println(s1.getName());
			System.out.println(s1.sum());
			System.out.println(s1.avg());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
