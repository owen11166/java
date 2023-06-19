package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class Brad38 {

	public static void main(String[] args) {
		// HashMap：基於哈希表的實現，提供快速的查找和插入性能。它不保證元素的順序，並且允許使用 null 作為鍵和值。
		// TreeMap：基於紅黑樹的實現，按鍵的自然順序進行排序。它保證元素按照鍵的順序進行迭代，並且不允許使用 null 作為鍵。
		// LinkedHashMap：基於哈希表和鏈表的實現，同時保證元素的插入順序。它按照插入順序迭代元素，或者按照訪問順序迭代元素（訪問順序是指當訪問到某個元素時，該元素會被移動到鏈表的尾部），並且允許使用
		// null 作為鍵和值。
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("gender", "male");
		map.put("weight", "80");
		System.out.println(map.get("name"));
		// map.keySet() 方法用於獲取 Map 中所有鍵的集合。它返回一個 Set，其中包含了 Map 中所有的鍵。
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "=>" + map.get(key));
		}
	}

}
