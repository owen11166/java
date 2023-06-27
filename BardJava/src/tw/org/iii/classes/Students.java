package tw.org.iii.classes;

import java.io.Serializable;

/*
 * 
在 Java 中，Serializable 是一個接口（interface），
它用於標識一個類別可以被序列化（serialization）和反序列化（deserialization）。
序列化是指將一個物件轉換成一個字節序列，可以用於保存在文件中或在網絡上進行傳輸。
反序列化則是將這個字節序列轉換回原始物件。
 */
public class Students implements Serializable {
	private int math, eng, ch;
	// private Bike bike;
	private String name;
	private Bike bike;

	public Students(int math, int eng, int ch, String name) {
		this.math = math;
		this.eng = eng;
		this.ch = ch;
		this.name = name;
		bike = new Bike(name);

	}

	public int sum() {
		return math + eng + ch;
	}

	public double avg() {
		return sum() / 3.0;
	}

	public String getName() {
		return name;
	}
}
