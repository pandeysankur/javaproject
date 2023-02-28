package collection.framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepetedNumberFind {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(14);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(73);
		list.add(73);
		HashSet<Integer> set = new HashSet(list);
		int max=0;
		for (Integer s : set) {
			int count = 0;
			for (Integer a : list) {
				if (s == a) {
					count++;
				}

			}
			if(max<count) {
				max=count;
			}
		

		}
		System.out.println("Total Max Dublicate value::"+max);
	}
}
