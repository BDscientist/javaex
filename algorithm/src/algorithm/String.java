package algorithm;

import java.util.*;

public class String {

	public void countString(String[] s) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if (!hm.containsKey(s[i]))
				hm.put(s[i], 0);
			hm.put(s[i], hm.get(s[i]) + 1);

		}
		for (String key : hm.keySet()) {
			System.out.println(key + "" + hm.get(key));
		}
	}

}
