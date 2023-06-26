package tw.org.iii.tutor;

import java.io.File;

public class Brad44 {
 public static void main(String[] args) {
	 File here=new File(".");
	 System.out.println(here.getAbsolutePath());
	 File dir1=new File("./dir1");
	 System.out.println(dir1.getAbsolutePath());
	 File dir3=new File("./dir3");
	 dir3.mkdir();
	 File dir4=new File("./dir3/dir4/dir5/dir6");
	 dir4.mkdirs();
 }
}
