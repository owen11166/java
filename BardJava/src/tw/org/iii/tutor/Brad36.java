package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Brad36 {
	public static void main(String[] args) {
		// 如果不關心元素順序且需要較好的性能，則選擇 HashSet；如果需要維護有序性並且對性能要求不高，則選擇 TreeSet。
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			set.add((int) (Math.random() * 49 + 1));
		}
		System.out.println(set);
		//--------------------------
		//Iterator 是一種用於遍歷集合類的介面
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			Integer ii=it.next();
			System.out.println(ii);
		}
		System.out.println("--------------");
		for(Integer ii:set) {
			System.out.println(ii);
		}
	}
}
