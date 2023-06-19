package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Set;

import tw.org.iii.classes.Bike;

public class Brad34 {

	public static void main(String[] args) {
		Set set = new HashSet ();
		set.add("Brad");
		set.add(123);
		set.add(12.3);
		set.add(new Bike());
		set.add("Brad");
		set.add(123);
		//不重複元素的個數
		System.out.println(set.size());
		//HashSet 不保證元素的順序所以輸出的順序可能不同
		System.out.println(set);
		

	}

}
