package tw.org.iii.tutor;

import java.util.LinkedList;

public class Brad37 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		// 當使用 list.add(index, element) 時，它會將指定的元素插入到 LinkedList
		// 中的指定索引位置，並且將後面的元素往後移動，以為新元素腾出空間。
		list.add(0, 1);
		list.add(0, 2);
		list.add(0, 3);
		list.add(0, 4);
		list.add(0, 1);
		System.out.println(list.size());
		System.out.println(list);
	}

}
