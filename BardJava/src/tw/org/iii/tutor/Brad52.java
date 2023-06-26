package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad52 {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("dir1/opendata.csv");
			BufferedReader breader=new BufferedReader(reader);
			String line;
			while((line=breader.readLine())!=null) {
				String[] row=line.split(",");
				System.out.println(row[2]);
			}
		} catch (Exception e) {
			
		}
	}

}
