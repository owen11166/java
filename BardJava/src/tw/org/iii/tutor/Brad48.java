package tw.org.iii.tutor;


import java.io.FileOutputStream;

public class Brad48 {

	public static void main(String[] args) {
		String mesg = "\n123456";
		try {
			//true代表附加（append）模式;false則每次執行該程式碼時都會覆寫檔案;預設值為false;
			FileOutputStream fout = new FileOutputStream("dir1/file10",true);
			//getBytes() 方法是用於將字串轉換為位元組陣列
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
