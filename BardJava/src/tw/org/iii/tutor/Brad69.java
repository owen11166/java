package tw.org.iii.tutor;

import tw.org.iii.classes.BCrypt;

public class Brad69 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);

		String password2 = "123456";
		if (BCrypt.checkpw(password2, hashPasswd)) {
			System.out.println("ok");
		} else {
			System.out.println("xx");
		}
	}

}
